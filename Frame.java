import javax.swing.*;
import java.awt.*;

public class Frame {
    public static void main(String[] args) {
//        ImageIcon image = new ImageIcon("parliamentary powers.jpeg"); // creates image-icon

//        JFrame frame = new JFrame(); // creates frame
//        frame.setTitle("My First Frame");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes frame with x button on mouse
//        frame.setResizable(false);
//        frame.setLayout(null); // manually need to set bounds for components
//        frame.setSize(500, 500); // sets frame size
//        frame.setIconImage(image.getImage()); // sets frame icon to image
//        frame.getContentPane().setBackground(new Color(0x9B5FD3)); // change color of frame
//        // background
//        //frame.pack(); // sets frame size to fit component exactly, use after adding all components
//        frame.setVisible(true); // makes frame visible, add at last so frame is rendered
//        // with all components attached otherwise might show white frame
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}
