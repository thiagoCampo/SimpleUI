import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {

    JButton but1 = new JButton("Press me");
    JButton but2 = new JButton("2+2");

    public ButtonPanel() {
        setLayout(new GridLayout(2,1));

        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The button worked!");
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(2 + 2);
            }
        });

        add(but1);
        add(but2);
    }
}