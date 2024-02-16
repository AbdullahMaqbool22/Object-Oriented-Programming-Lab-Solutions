import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DelPatient extends JFrame {
    JLabel l1;
    JTextField t1;
    JButton b1, b2, b3;
    JPanel p1, p2;

    public DelPatient() {
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(2, 1));
        p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 2));
        p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 3));
        b1 = new JButton("Delete");
        b2 = new JButton("Cancel");
        b3 = new JButton("Home");
        l1 = new JLabel("Enter ID");
        t1 = new JTextField(20);
        p1.add(l1);
        p1.add(t1);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.SOUTH);
        MyActionListener a = new MyActionListener();
        b1.addActionListener(a);
        b2.addActionListener(a);
        b3.addActionListener(a);

    }

    public class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equalsIgnoreCase("Delete")) {
                ArrayList<Patient> list = Patient.readFromFile();
                int a = Integer.parseInt(t1.getText());
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).ID == a) {
                        Patient.delPatient(i);
                    }
                }
            } else if (e.getActionCommand().equalsIgnoreCase("Cancel")) {
                System.exit(0);
            } else if (e.getActionCommand().equalsIgnoreCase("Home")) {
                dispose();
                new Home();
            }
        }

    }

}
