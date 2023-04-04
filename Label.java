import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Label {
    public static void main(String[] args) {
//        ImageIcon image = new ImageIcon("parliamentary powers.jpeg"); // creates image-icon
//        Border border = BorderFactory.createLineBorder(Color.PINK, 3);
//
//        //Label = a gui display area for string, image etc.
//        JLabel label = new JLabel();
//        label.setText("myLabel");
//        label.setIcon(image);
//        label.setHorizontalTextPosition(JLabel.CENTER); // set text left, right or centre of image
//        label.setVerticalTextPosition(JLabel.TOP); // set text up, down or centre of image
//        label.setForeground(new Color(0x123456));
//        //noinspection SpellCheckingInspection
//        label.setFont(new Font("MV Boli", Font.PLAIN, 30)); // sets font, font style
//        // and font size of text
//        label.setIconTextGap(-5); // sets gap of text to image
//        label.setBackground(Color.CYAN);
//        label.setOpaque(true);
//        label.setBorder(border);
//        label.setVerticalAlignment(0); //  0 = center
//        label.setHorizontalAlignment(0); // 0 = center
//        label.setBounds(0,0,400,400); // sets x, y positions as well as dimensions
        MyLabel label = new MyLabel();
        label.setBounds(0, 0, 450, 450); // // sets x, y positions as well as dimensions
        MyFrame frame = new MyFrame();

        frame.add(label); // adds label to frame, before making frame visible
        //frame.pack(); // sets frame size to fit component exactly, use after adding all components
        frame.setVisible(true); // makes frame visible, add at last so frame is rendered
        // with all components attached otherwise might show white frame
    }
}
