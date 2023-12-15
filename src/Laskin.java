import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Laskin extends JFrame implements ActionListener {

    private ImageIcon hymynaama;
    private JLabel kuvaKentta;
    private KerrosPaneeli kerrosPaneeli;
    private NayttoKentta nayttoKentta;
    private NappainKentta nappainKentta;

    private boolean tarkistus;

    private FunktioNappain plusNappain;
    private FunktioNappain miinusNappain;
    private FunktioNappain kertoNappain;
    private FunktioNappain jakoNappain;
    private FunktioNappain tulosNappain;
    private FunktioNappain tyhjennaNappain;

    private Nappain[] nappaimet;
    private int num1;
    private int num2;
    private int tulos;
    private String operaattori;

    Laskin() {

        nappaimet = new Nappain[10];

        for (int i = 0; i < nappaimet.length; i++) {

            nappaimet[i] = new Nappain(Integer.toString(i));
            nappaimet[i].addActionListener(this);

        }

        plusNappain = new FunktioNappain("+");
        plusNappain.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
        plusNappain.addActionListener(this);
        miinusNappain = new FunktioNappain("-");
        miinusNappain.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
        miinusNappain.addActionListener(this);
        kertoNappain = new FunktioNappain("*");
        kertoNappain.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 5));
        kertoNappain.addActionListener(this);
        jakoNappain = new FunktioNappain("/");
        jakoNappain.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 5));
        jakoNappain.addActionListener(this);
        tulosNappain = new FunktioNappain("=");
        tulosNappain.setBorder(BorderFactory.createLineBorder(Color.CYAN, 5));
        tulosNappain.addActionListener(this);
        tyhjennaNappain = new FunktioNappain("CLR");
        tyhjennaNappain.setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 5));
        tyhjennaNappain.addActionListener(this);

        hymynaama = new ImageIcon(getClass().getResource("hymynaama.png"));

        kuvaKentta = new JLabel();
        kuvaKentta.setIcon(hymynaama);
        kuvaKentta.setBounds(0, 0, 94, 125);

        kerrosPaneeli = new KerrosPaneeli();
        nayttoKentta = new NayttoKentta();

        nappainKentta = new NappainKentta();
        nappainKentta.add(nappaimet[1]);
        nappainKentta.add(nappaimet[2]);
        nappainKentta.add(nappaimet[3]);
        nappainKentta.add(plusNappain);
        nappainKentta.add(nappaimet[4]);
        nappainKentta.add(nappaimet[5]);
        nappainKentta.add(nappaimet[6]);
        nappainKentta.add(miinusNappain);
        nappainKentta.add(nappaimet[7]);
        nappainKentta.add(nappaimet[8]);
        nappainKentta.add(nappaimet[9]);
        nappainKentta.add(kertoNappain);
        nappainKentta.add(tyhjennaNappain);
        nappainKentta.add(nappaimet[0]);
        nappainKentta.add(tulosNappain);
        nappainKentta.add(jakoNappain);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450, 650);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("Haapanen Johannes Laskinsovellus");

        this.add(kuvaKentta);
        this.add(kerrosPaneeli);
        this.add(nayttoKentta);
        this.add(nappainKentta);
        this.setVisible(true);

        tarkistus = true;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            for (int i = 0; i < 10; i++) {

                if (e.getSource() == nappaimet[i]) {

                    if (nayttoKentta.getText().equals("") || tarkistus == true || nayttoKentta.getText().equals("+")
                            || nayttoKentta.getText().equals("-") || nayttoKentta.getText().equals("*")
                            || nayttoKentta.getText().equals("/")) {

                        nayttoKentta.setText(Integer.toString(i));
                        tarkistus = false;

                    }

                    else if (!nayttoKentta.getText().equals("Virhe! Nollaa laskin (CLR)")) {

                        nayttoKentta.setText(nayttoKentta.getText() + Integer.toString(i));

                    }

                }

            }

            if (e.getSource() == plusNappain) {

                if (!nayttoKentta.getText().equals("") && !nayttoKentta.getText().equals("+")
                        && !nayttoKentta.getText().equals("-") && !nayttoKentta.getText().equals("*")
                        && !nayttoKentta.getText().equals("/")) {

                    num1 = Integer.parseInt(nayttoKentta.getText());
                    nayttoKentta.setText("+");
                    operaattori = "+";

                }

            }

            if (e.getSource() == miinusNappain) {

                if (!nayttoKentta.getText().equals("") && !nayttoKentta.getText().equals("+")
                        && !nayttoKentta.getText().equals("-") && !nayttoKentta.getText().equals("*")
                        && !nayttoKentta.getText().equals("/")) {

                    num1 = Integer.parseInt(nayttoKentta.getText());
                    nayttoKentta.setText("-");
                    operaattori = "-";

                }

            }

            if (e.getSource() == kertoNappain) {

                if (!nayttoKentta.getText().equals("") && !nayttoKentta.getText().equals("+")
                        && !nayttoKentta.getText().equals("-") && !nayttoKentta.getText().equals("*")
                        && !nayttoKentta.getText().equals("/")) {

                    num1 = Integer.parseInt(nayttoKentta.getText());
                    nayttoKentta.setText("*");
                    operaattori = "*";

                }

            }

            if (e.getSource() == jakoNappain) {

                if (!nayttoKentta.getText().equals("") && !nayttoKentta.getText().equals("+")
                        && !nayttoKentta.getText().equals("-") && !nayttoKentta.getText().equals("*")
                        && !nayttoKentta.getText().equals("/")) {

                    num1 = Integer.parseInt(nayttoKentta.getText());
                    nayttoKentta.setText("/");
                    operaattori = "/";

                }

            }

            if (e.getSource() == tulosNappain) {

                if (!nayttoKentta.getText().equals("") && !nayttoKentta.getText().equals("+")
                        && !nayttoKentta.getText().equals("-") && !nayttoKentta.getText().equals("*")
                        && !nayttoKentta.getText().equals("/")) {

                    if (tarkistus == false) {

                    num2 = Integer.parseInt(nayttoKentta.getText());

                    }

                    switch (operaattori) {

                        case "+":
                            tulos = num1 + num2;
                            break;

                        case "-":
                            tulos = num1 - num2;
                            break;

                        case "*":
                            tulos = num1 * num2;
                            break;

                        case "/":
                            tulos = num1 / num2;

                    }

                    nayttoKentta.setText(Integer.toString(tulos));
                    num1 = tulos;
                    tarkistus = true;

                }

            }

            if (e.getSource() == tyhjennaNappain) {

                num1 = 0;
                num2 = 0;
                nayttoKentta.setText("");
                tarkistus = true;

            }

        } catch (NumberFormatException n) {

            num1 = 0;
            num2 = 0;
            nayttoKentta.setText("Virhe! Nollaa laskin (CLR)");

        }

    }

}