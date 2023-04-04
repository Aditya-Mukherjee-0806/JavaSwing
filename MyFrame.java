import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    Image_Border image_border = new Image_Border();
    MyFrame() {
        this.setTitle("My First Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes frame with x button on mouse
        this.setResizable(false);
        this.setLayout(null); // manually need to set bounds for components
        this.setSize(750, 750); // sets frame size
        this.setIconImage(image_border.getIcon().getImage()); // sets frame icon to image
        this.getContentPane().setBackground(new Color(0x9B5FD3)); // change color of frame
        // background
        //this.setVisible(true);
    }
}
