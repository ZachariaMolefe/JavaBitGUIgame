import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
public class Blevel1 extends JFrame
{
    private JButton btnwrong1, btnanswer, btnwrong2, btnback;
    private JLabel lblquest, lblpic ;
    public Blevel1()
    {
        super("Binary Stage");
        getContentPane().setLayout(null);

        btnwrong1 = new JButton();
        btnwrong1.setFont(new Font("SansSerif", 0, 24)); 
        btnwrong1.setText("1101");
        getContentPane().add(btnwrong1);
        btnwrong1.setBounds(243, 197, 127, 56);

        btnanswer = new JButton();
        btnanswer.setFont(new Font("SansSerif", 0, 24)); 
        btnanswer.setText("1000");
        getContentPane().add(btnanswer);
        btnanswer.setBounds(29, 195, 127, 61);

        btnwrong2 = new JButton();
        btnwrong2.setFont(new Font("SansSerif", 0, 24));
        btnwrong2.setText("0110");
        getContentPane().add(btnwrong2);
        btnwrong2.setBounds(463, 195, 127, 61);
        
        ButtonHandler handler = new ButtonHandler();
        btnwrong1.addActionListener(handler);
        btnanswer.addActionListener(handler);
        btnwrong2.addActionListener(handler);

        lblquest = new JLabel();
        lblquest.setFont(new Font("Bauhaus 93", 0, 24)); 
        lblquest.setText("WHICH OF THE FOLLOWING IS NUMBER 8 IN BINARY");
        getContentPane().add(lblquest);
        lblquest.setBounds(40, 90, 543, 49);

        lblpic = new JLabel();
        lblpic.setIcon(new ImageIcon("StagesBackground.jpg"));
        lblpic.setText("lblpic");
        getContentPane().add(lblpic);
        lblpic.setBounds(0, -10, 645, 315);
    }
    
    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == btnwrong1 ||e.getSource() == btnwrong2)
            {
                JOptionPane.showMessageDialog(null, "ERROR101\nYou lose!\nWith 2 points");
                dispose();
                NavScreen nav = new NavScreen();
                nav.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                nav.setSize(385,330);
                nav.setResizable(false);
                //nav.setAlwaysOnTop(true);
                nav.setLocationRelativeTo(null);
                nav.setVisible(true);
            }
            if(e.getSource() == btnanswer)
            {
                dispose();
                Blevel2 last = new Blevel2();
                last.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //last.setAlwaysOnTop(true);
                last.setSize(650,330);
                last.setResizable(false);
                last.setLocationRelativeTo(null);
                last.setVisible(true);
            }
        }
    }
}