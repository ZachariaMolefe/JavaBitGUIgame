import javax.swing.JFrame;
import javax.swing.JWindow;
import java.awt.Dimension;
import java.awt.Toolkit;
public class testGame
{
    public static void main(String args[])
    {
        try
        {
            Splashscreen splash = new Splashscreen();
            int width = 450;
            int height = 345;
            Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (screen.width - width) / 2;
            int y = (screen.height - height) / 2;
            splash.setBounds(x, y, width, height);
            
            //splash.setSize(450,345);
            splash.setVisible(true);
            Thread.sleep(5000);
            //splash.setLocationRelativeTo(null);
            splash.dispose();
        }
        catch(InterruptedException e){}
        
        GameGUI mygui = new GameGUI();
        mygui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mygui.setSize(600,500);
        mygui.setResizable(false);
        mygui.setAlwaysOnTop(true);
        mygui.setLocationRelativeTo(null);
        mygui.setVisible(true);

    }
}