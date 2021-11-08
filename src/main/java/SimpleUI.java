import javax.swing.*;
import java.awt.*;

public class SimpleUI {
    static GraphicsConfiguration gc;

    public static void main(String[] args) {
        JFrame frame = new JFrame(gc);
        frame.setSize(500, 300);
        frame.getContentPane().add(new ButtonPanel());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
