import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame2 extends JFrame implements ActionListener {
    JButton button = new JButton();
    JLabel label = new JLabel();

    MyFrame2() {
        label.setBounds(200,150,100,100);

        button.setBounds(200, 150, 100, 100);
        button.addActionListener(this);
        button.addActionListener(e -> System.out.println("POP"));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);

        this.add(label);
        this.add(button);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("pop");
            button.setEnabled(false);
            label.setText(" X");
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.BOTTOM);
            label.setFont(new Font("default", Font.BOLD,75));
        }
    }
}
