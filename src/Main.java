import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //1 create a frame
        JFrame frame = new JFrame("My first frame :)");
        frame.setSize(500,500);

        //2 create a panel
        // default layout is FlowLayout
        JPanel panel = new JPanel();
        panel.setBackground(new Color(57,150,100));
        //panel.setBackground(Color.PINK)

        //3 create components
        JLabel label = new JLabel("Goodbye world");
        JButton button = new JButton("Don't push button");
        JTextField textField = new JTextField(5);
        JSpinner spinner = new JSpinner();

        // add an image
        ImageIcon icon = new ImageIcon("Images/MyCards/2C.png");
        // Scaling the image before putting it on the label
        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        // Creating a Label with an icon on it
        JLabel picLabel = new JLabel(icon);


        //4 add components to the panel
        panel.add(label);
        panel.add(button);
        panel.add(textField);
        panel.add(picLabel);
        panel.add(spinner);


        //5 add the panel to the frame
        frame.add(panel);

        //6 set frame visible
        frame.setVisible(true);


    }
}