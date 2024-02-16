import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

class MyClass extends JFrame {
    JButton b1;
    JLabel l1;
    JTextField t1;

    public MyClass() {
        setSize(2160, 1440);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout());

        l1 = new JLabel("Enter Name");
        t1 = new JTextField(20);
        b1 = new JButton("Submit");

        MyActionListener a = new MyActionListener();
        b1.addActionListener(a);

        add(l1);
        add(t1);
        add(b1);

    }

    public class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Submit")) {
                JOptionPane.showMessageDialog(new JFrame(), "Your name is: " + t1.getText());

            }

        }

    }

}