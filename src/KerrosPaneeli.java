import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class KerrosPaneeli extends JLayeredPane{

    private ImageIcon kuva;
    private JLabel ekaKerros;
    private JLabel tokaKerros;

    KerrosPaneeli() {

        kuva = new ImageIcon(getClass().getResource("puhekupla.png"));

        this.setBounds(94, 0, 125, 75);

        ekaKerros = new JLabel();
        ekaKerros.setIcon(kuva);
        ekaKerros.setBounds(0, 0, 125, 75);

        tokaKerros = new JLabel();
        tokaKerros.setText("Tervetuloa!");
        tokaKerros.setBounds(20, 15, 75, 30);

        this.add(ekaKerros,Integer.valueOf(0));
        this.add(tokaKerros,Integer.valueOf(1));

    }

    public JLabel getTokaKerros() {
        return tokaKerros;
    }
    
}

