import javax.swing.*;
import java.awt.*;

public class Panel {
    public static void main(String[] args) {
        // JPanel = a gui component that functions as a container to hold other components
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(0,0,500,500); // bounds of panel within frame
        bluePanel.setLayout(null);

        MyLabel label = new MyLabel();
        label.setBounds(0,0,450,450); // bounds of label within panel

        bluePanel.add(label);


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(505,0,150,500);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,505,655,150);

        MyFrame frame = new MyFrame();
        frame.add(greenPanel);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.setVisible(true);
    }
}
