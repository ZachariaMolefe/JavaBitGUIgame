import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import javax.swing.JOptionPane;
public class NameFiles
{
    public void read()
    {
        int count = 0;
        GameGUI[] arrGui = new GameGUI[50];
        try
        {
           Scanner sc = new Scanner(new FileReader("Error101Players.txt"));
           while(sc.hasNext())
           {
               String line = sc.nextLine();
               
               String[] info = line.split(",");
               String name = info[0];
               
               
               
           }
           sc.close();
        }catch(IOException exc)
        {
            JOptionPane.showMessageDialog(null,"Error opening the file");
        }
    }
    
    public void write()
    {
        GameGUI arrGui = new GameGUI();
        String name = arrGui.getName();
        try
        {
            PrintWriter writer = new PrintWriter("Error101Players.txt");
            writer.println(name);
            writer.close();
        }catch(IOException exc)
        {
            JOptionPane.showMessageDialog(null,"Error creating the file");
        }
    }
}
