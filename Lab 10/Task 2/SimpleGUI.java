import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class SimpleGUI extends JFrame {
    JButton b1, b2;

    public SimpleGUI() {
        setSize(2160, 1440);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout());
        b1 = new JButton("Click me");
        b2 = new JButton("Exit");
        MyActionListener a1 = new MyActionListener();
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        add(b1);
        add(b2);
    }

    public class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Exit")) {
                System.exit(0);
            } else if (e.getActionCommand().equals("Click me")) {
                JOptionPane.showMessageDialog(null, " I am Clicked!");

            }
        }

    }

}