import java.awt.*;
import javax.swing.*;

public class Lab85Layout extends JFrame {
    public Lab85Layout() 
    {
        super("_______________________");
        Container c = getContentPane();

        // panel 1: vertical box layout
        JPanel p1 = new JPanel();
        p1.setLayout( new BoxLayout(_______, BoxLayout.Y_AXIS));
        JCheckBox check1 = new JCheckBox("Add Matrix");
        JCheckBox check2 = new JCheckBox("Upgrade Matrix");
        JCheckBox check3 = new JCheckBox("Cancle Matrix");

        p1.add(________________);
        p1.add(________________);
        p1.add(________________);

        // panel 2: vertical box layout
        JPanel p2 = new JPanel();
        p2.setLayout( new BoxLayout(_______,__________________));
        JButton btn1= new JButton("Ok");
        JButton btn2 = new JButton("Cancel");

        p2.add(________________);
        p2.add(________________);

        // Label 1 : Center Application
        JLabel label1 = new JLabel( new 
        ImageIcon("images/03_Animation.gif"));

        // add panels and image to frame
        c.add(p1, BorderLayout._______________);
        c.add(label1, BorderLayout.___________);
        c.add(p2, BorderLayout._______________);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setResizable(false); // disable window resizing
        setLocationRelativeTo(null); 
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        new ___________________ ;

    }
}
