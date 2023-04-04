import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Image_Border {
    private ImageIcon icon = new ImageIcon("parliamentary powers.jpeg"); // creates image-icon
    Border border = BorderFactory.createLineBorder(Color.PINK, 3);

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public Border getBorder() {
        return border;
    }

    public void setBorder(Border border) {
        this.border = border;
    }
}
