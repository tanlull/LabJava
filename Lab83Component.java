import java.awt.*;
import javax.swing.*;
public class Lab83Component 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("My Frame");
        frame.setSize(858, 858);
        _______________________________ // Create Panel
        _______________________________ // Set Color BG
        Icon icon1 = new ImageIcon("________________________________");
        Icon icon2 = new ImageIcon("________________________________");

        JButton btn1 = new JButton("Button",_____________);

        JLabel label1 = new JLabel("Click here",SwingConstants.RIGHT);
        JLabel label2 = new JLabel("Animation",icon2,SwingConstants.LEFT);

        label1.setForeground(Color.__________________);
        label2.setForeground(Color.__________________);

        panel.__________________; // add component1 btn
        panel.__________________; // add component2 label1
        panel.__________________; // add component3 label2
        
        frame.add(panel); // Add Panel into Contaniner
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
