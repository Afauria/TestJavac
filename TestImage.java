import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class TestImage extends JFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                TestImage frame = new TestImage();
                frame.setVisible(true);
            }
        });
    }

    public TestImage() {
        setBounds(100, 100, 200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        setContentPane(pane);
        pane.setLayout(null);
        JLabel img = new JLabel();
        img.setBounds(50, 20, 100, 100);
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/icon.png"));
        icon.setImage(icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        img.setIcon(icon);
        pane.add(img);
    }
}