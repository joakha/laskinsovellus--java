import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class NayttoKentta extends JTextField {

    NayttoKentta() {

        this.setEditable(false);
        this.setBounds(53,150, 325, 50);
        this.setBackground(Color.DARK_GRAY);
        this.setForeground(Color.WHITE);
        this.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));

    }
    
}
