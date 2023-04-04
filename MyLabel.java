import javax.swing.*;
import java.awt.*;

public class MyLabel extends JLabel {
    Image_Border image_border = new Image_Border();

    MyLabel() {
        //Label = a gui display area for string, image etc.
        this.setText("myLabel");
        this.setIcon(image_border.getIcon());
        this.setHorizontalTextPosition(JLabel.CENTER); // set text left, right or centre of image
        this.setVerticalTextPosition(JLabel.TOP); // set text up, down or centre of image
        this.setForeground(new Color(0x123456));
        //noinspection SpellCheckingInspection
        this.setFont(new Font("MV Boli", Font.PLAIN, 30)); // sets font, font style
        // and font size of text
        this.setIconTextGap(-5); // sets gap of text to image
        this.setBackground(Color.CYAN);
        this.setOpaque(true);
        this.setBorder(image_border.getBorder());
        this.setVerticalAlignment(0); //  0 = center
        this.setHorizontalAlignment(0); // 0 = center
    }
}
