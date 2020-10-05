import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

//java
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class NavScreen extends JFrame
{
    private JLabel lblpic, lblheading;
    private JButton btnBinary, btnHexa, btnOctal, btnback;
    
    public NavScreen()
    {
        super("ERROR 101 Select");
        
        getContentPane().setLayout(null);

        btnBinary = new JButton("Binary stage");
        btnBinary.setFont(new Font("Comic Sans MS", 0, 18));
        getContentPane().add(btnBinary);
        btnBinary.setBounds(90, 140, 220, 35);

        btnHexa = new JButton("Hexadecimal stage");
        btnHexa.setFont(new Font("Comic Sans MS", 0, 18)); 
        getContentPane().add(btnHexa);
        btnHexa.setBounds(90, 190, 220, 35);

        btnOctal = new JButton("Octal Stage");
        btnOctal.setFont(new Font("Comic Sans MS", 0, 18));
        getContentPane().add(btnOctal);
        btnOctal.setBounds(90, 240, 220, 35);

        lblheading = new JLabel("ERROR 101 stages");
        lblheading.setFont(new Font("Comic Sans MS", 0, 36)); 
        getContentPane().add(lblheading);
        lblheading.setBounds(30, 40, 350, 90);

        btnback = new JButton("<");
        btnback.setToolTipText("Go Back");
        getContentPane().add(btnback);
        btnback.setBounds(0, 260, 40, 40);
        
        ButtonHandler handler = new ButtonHandler();
        btnBinary.addActionListener(handler);
        btnHexa.addActionListener(handler);
        btnOctal.addActionListener(handler);
        btnback.addActionListener(handler);
        
        
        lblpic = new JLabel();
        lblpic.setIcon(new ImageIcon("HomeBackground.png")); 
        getContentPane().add(lblpic);
        lblpic.setBounds(0, 0, 400, 300);
    }
    
    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == btnBinary)
            {
                dispose();
                BinaryStage binst = new BinaryStage();
                binst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //binst.setAlwaysOnTop(true);
                binst.setSize(650,330);
                binst.setResizable(false);
                binst.setLocationRelativeTo(null);
                binst.setVisible(true);
                
            }
            
            if(e.getSource() == btnHexa)
            {
                dispose();
                HexadecimalStage hexst = new HexadecimalStage();
                hexst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //hexst.setAlwaysOnTop(true);
                hexst.setSize(650,330);
                hexst.setResizable(false);
                hexst.setLocationRelativeTo(null);
                hexst.setVisible(true);
            }
            
            if(e.getSource() == btnOctal)
            {
                dispose();
                OctalStage octst = new OctalStage();
                octst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //octst.setAlwaysOnTop(true);
                octst.setResizable(false);
                octst.setSize(650,330);
                octst.setLocationRelativeTo(null);
                octst.setVisible(true);
            }
            
            if(e.getSource() == btnback)
            {
                dispose();
                GameGUI gui = new GameGUI();
                gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui.setSize(600,500);
                gui.setAlwaysOnTop(true);
                gui.setResizable(false);
                gui.setLocationRelativeTo(null);
                gui.setVisible(true);
            }
        }
    }
}