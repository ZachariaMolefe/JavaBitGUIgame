import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Olevel1 extends JFrame
{
    private JButton btnwrong1, btnanswer, btnwrong2;
    private JLabel lblquest, lblpic ;
    public Olevel1()
    {
        super("Octal Stage");
        
        btnwrong1 = new JButton();
        btnwrong1.setFont(new Font("SansSerif", 0, 24)); 
        btnwrong1.setText("001");
        getContentPane().add(btnwrong1);
        btnwrong1.setBounds(29, 197, 127, 56);

        btnanswer = new JButton();
        btnanswer.setFont(new Font("SansSerif", 0, 24)); 
        btnanswer.setText("111");
        getContentPane().add(btnanswer);
        btnanswer.setBounds(463, 195, 127, 61);

        btnwrong2 = new JButton();
        btnwrong2.setFont(new Font("SansSerif", 0, 24));
        btnwrong2.setText("110");
        getContentPane().add(btnwrong2);
        btnwrong2.setBounds(243, 195, 127, 61);
                            
        ButtonHandler handler = new ButtonHandler();
        btnanswer.addActionListener(handler);
        btnwrong1.addActionListener(handler);
        btnwrong2.addActionListener(handler);

        lblquest = new JLabel();
        lblquest.setFont(new Font("Bauhaus 93", 0, 24)); 
        lblquest.setText("WHICH OF THE FOLLOWING IS NUMBER 7 IN OCTAL");
        getContentPane().add(lblquest);
        lblquest.setBounds(40, 90, 543, 49);

        lblpic = new JLabel();
        lblpic.setIcon(new ImageIcon("StagesBackground.jpg"));
        lblpic.setText("lblpic");
        getContentPane().add(lblpic);
        lblpic.setBounds(0, -10, 630, 310);
    }
    
    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == btnwrong1 || e.getSource() == btnwrong2)
            {
                JOptionPane.showMessageDialog(null, "ERROR101\nYou lose!\nWith 2 points");
                dispose();
                NavScreen nav = new NavScreen();
                nav.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                nav.setSize(385,330);
                nav.setResizable(false);
                nav.setAlwaysOnTop(true);
                nav.setLocationRelativeTo(null);
                nav.setVisible(true);
            }
            if(e.getSource() == btnanswer)
            {
                dispose();
                Olevel2 level2 = new Olevel2();
                level2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //level2.setAlwaysOnTop(true);
                level2.setSize(650,330);
                level2.setResizable(false);
                level2.setLocationRelativeTo(null);
                level2.setVisible(true);
            }
        }
        
    }
}