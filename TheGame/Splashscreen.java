import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
public class Splashscreen extends JWindow
{
    public Splashscreen()
    {
        JLabel pic = new JLabel();
        pic.setText("Welcome to the game player!");
        pic.setLocation(20,20);
        
        add(pic);
        getContentPane().add(new JLabel("Welcome to the Game",new ImageIcon("Splashscreen.png"),SwingConstants.CENTER));
    }
}
