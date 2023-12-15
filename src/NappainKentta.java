import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class NappainKentta extends JPanel {


    NappainKentta() {

        this.setBackground(Color.DARK_GRAY);
        this.setLayout(new GridLayout(4, 4, 5, 5));
        this.setBounds(53, 225, 325, 325);

    }
    
}
