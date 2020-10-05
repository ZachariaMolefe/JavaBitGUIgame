//javax
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JWindow;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
//java
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import java.io.IOException;
public class GameGUI extends JFrame
{
    //private JPanel mainpanel, bottompanel, namepanel, textpanel, buttonpanel;
    private JLabel lblgamename, lblplayer, lblpic;
    private JTextField txtname;
    private JButton btnabout, btnquit, btntakech;
    public GameGUI()
    {
        super("ERROR101");
        
        JFrame pic = new JFrame();
        pic.setContentPane(new JLabel(new ImageIcon(("binary.jpg"))));
        pic.setUndecorated(true);
        pic.pack();
        pic.setVisible(true);
        validate();
        
        
        btnabout = new JButton("About");
        btnabout.setFont(new Font("Modern 20", 1,10));
        btnabout.setBounds(0, 0, 70, 25);
        btnabout.setBackground(null);
        getContentPane().add(btnabout);
        
        btnquit = new JButton("Quit");
        btnquit.setFont(new Font("Bauhaus 93", 1, 18));
        getContentPane().add(btnquit);
        btnquit.setBounds(22, 405, 104, 37);

        btntakech = new JButton("Take Challenge");
        btntakech.setFont(new Font("Bauhaus 93", 1, 18));
        getContentPane().add(btntakech);
        btntakech.setBounds(371, 405, 193, 37);
        btntakech.setEnabled(false);

        lblgamename = new JLabel("ERROR 101");
        lblgamename.setFont(new Font("Old English Text MT", 1, 48)); 
        lblgamename.setToolTipText("The game's name");
        lblgamename.setBounds(184, 19, 325, 171);
        getContentPane().add(lblgamename);

        lblplayer = new JLabel("Name:");
        lblplayer.setFont(new Font("Tw Cen MT", 1, 24)); 
        getContentPane().add(lblplayer);
        lblplayer.setBounds(180, 210, 67, 27);
        
        txtname = new JTextField();
        getContentPane().add(txtname);
        txtname.setToolTipText("Enter You Name Player");
        txtname.setBounds(263, 214, 126, 27);

        lblpic = new JLabel();
        lblpic.setIcon(new ImageIcon("HomeBackground.png")); 
        lblpic.setText("lblpic");
        getContentPane().add(lblpic);
        lblpic.setBounds(0, -20, 860, 500);
        
        //listeners
        TextHandler txthandler = new TextHandler();
        txtname.addActionListener(txthandler);
        
        ButtonHandler btnhandler = new ButtonHandler();
        btnquit.addActionListener(btnhandler);
        btntakech.addActionListener(btnhandler);
        btnabout.addActionListener(btnhandler);
    }
    
    public String getName()
    {
        return txtname.getText();
    }
    
    private class TextHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(txtname.getText() != "")
            {
                btntakech.setEnabled(true);
            }
        }
    }
    
    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == btntakech)
            {
                dispose();
                NavScreen nav = new NavScreen();
                nav.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                nav.setSize(385,330);
                nav.setResizable(false);
                nav.setAlwaysOnTop(true);
                nav.setLocationRelativeTo(null);
                nav.setVisible(true);
            }
            if(e.getSource() == btnabout)
            {
                
                AboutGUI about = new AboutGUI();
                dispose();
                about.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                about.setSize(552,390);
                about.setLocationRelativeTo(null);
                about.setResizable(false);
                about.setVisible(true);
                about.setAlwaysOnTop(true);
            }
            if(e.getSource() == btnquit)
            {
                System.exit(1);
            }
        }
    }
}