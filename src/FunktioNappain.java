import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

public class FunktioNappain extends JButton implements MouseListener{


        FunktioNappain(String teksti) {
        this.setText(teksti);
        this.setFocusable(false);
        this.setBackground(Color.DARK_GRAY);
        this.setForeground(Color.WHITE);
        this.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        this.addMouseListener(this);

    }

    

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        this.setBackground(Color.DARK_GRAY);

    }

    @Override
    public void mouseReleased(MouseEvent e) {

        this.setBackground(Color.BLACK);

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        this.setBackground(Color.BLACK);

    }

    @Override
    public void mouseExited(MouseEvent e) {

        this.setBackground(Color.DARK_GRAY);

    }
    
}
