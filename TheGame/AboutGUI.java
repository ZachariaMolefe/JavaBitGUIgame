import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AboutGUI extends JFrame
{
    GameGUI name = new GameGUI();
    private JButton OKbtn;
    private JLabel lblpic;
    private JTextArea msg;
    private JScrollPane scroll;
    public AboutGUI()
    {
        super("About");
        
        getContentPane().setLayout(null);
    
        OKbtn = new JButton();
        OKbtn.setFont(new Font("Bauhaus 93", 0, 18));
        OKbtn.setText("OK");
        OKbtn.setToolTipText("Leave Page");
        getContentPane().add(OKbtn);
        OKbtn.setBounds(20, 320, 90, 37);
        
        ButtonHandler handler = new ButtonHandler();
        OKbtn.addActionListener(handler);
        
        msg = new JTextArea();
        msg.setEditable(false);
        msg.setVisible(true);
        msg.setColumns(20);
        msg.setRows(5);
        msg.setText("------------------------------------------------------------------------------------------------------------------------------------------------\nThis is an open source application..\n------------------------------------------------------------------------------------------------------------------------------------------------\nPROJECT TITLE: ERROR 101\nPURPOSE OF PROJECT: To teach students how to use the number system in programming\nVERSION or DATE: v_1\nHOW TO START THIS PROJECT: Option Click The testGame class and click on the void main(string[]args) to run the application\nThe game will start with HomeScreen where the player can enter their names. After the HomeScreen there is a NavigationScreen\nwhere the player selects the stage they wish to participate in\nAUTHORS: BT MAKUNYANE and MZ MOLEFE\nUSER INSTRUCTIONS: The player has to convert a given Integer value to either binary, hexadecimal, or octal number system.\n\n------------------------------------------------------------------------------------------------------------------------------------------------\n\nList of players\n\n" + name.getName());
        getContentPane().add(msg);
        msg.setBackground(new Color(204, 204, 204));
        
        scroll = new JScrollPane();
        scroll.setViewportView(msg);
        
        getContentPane().add(scroll);
        scroll.setBounds(20, 10, 500, 290);
        
        lblpic = new JLabel();
        lblpic.setIcon(new ImageIcon(("HomeBackground.png")));
        getContentPane().add(lblpic);
        lblpic.setBounds(0, -10, 550, 380);
    }
    
    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == OKbtn)
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