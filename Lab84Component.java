import java.awt.*;
import javax.swing.*;

public class Lab84Component {
    public static void main(String[] args) {
        Font font1 = new Font("Courier New", Font.BOLD, 20);
        JFrame frame = new JFrame("___________________");
        frame.setSize(480, 360);
        _______________________________ // Create Panel
        _______________________________ // Set Color BG

        JLabel label1 = new JLabel(_________________________________
        ______________________________); // Create label1

        label1.setFont(_______________);
        label1.setPreferredSize(new Dimension(480, _________));
        label1.setForeground(Color.white);

        JTextField text1 = new JTextField("Username",30);
        text1.setFont(________________);

        JPasswordField pass1 = new JPasswordField("12345", 30);
        pass1.setFont(________________);

        JCheckBox checkbox1 = new JCheckBox("__________");
        checkbox1.setFont(__________);
        checkbox1.setBackground(__________);
        checkbox1.setForeground(__________);

        JCheckBox checkbox2 = new JCheckBox("__________");
        checkbox2.setFont(__________);
        checkbox2.setBackground(____________________);
        checkbox2.setForeground(____________________);

        JButton btn1 = new JButton("__________");
        btn1.setFont(__________);
        btn1.setPreferredSize(new Dimension(370, 30));

        panel.add(__________); panel.add(__________);
        panel.add(__________); panel.add(__________);
        panel.add(__________); panel.add(__________);

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        }
        }
}
