import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PatientEntryFormFrame extends JFrame {
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1, b2, b3;
    JPanel p1, p2;

    public PatientEntryFormFrame() {
        setTitle("Patient Entry.");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(2, 1));
        p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 2));
        p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 3));
        l1 = new JLabel("Enter Name: ");
        t1 = new JTextField(20);
        l2 = new JLabel("Enter Age: ");
        t2 = new JTextField(3);
        l3 = new JLabel("Enter ID: ");
        t3 = new JTextField(5);
        l4 = new JLabel("Enter Illness: ");
        t4 = new JTextField(20);
        b1 = new JButton("Submit");
        b2 = new JButton("Exit");
        b3 = new JButton("Display");

        MyActionListener a = new MyActionListener();
        b1.addActionListener(a);
        b2.addActionListener(a);
        b3.addActionListener(a);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        add(b2);
        add(b3);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(t4);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

    }

    public class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equals("Submit")) {
                int a = Integer.parseInt(t2.getText());
                int b = Integer.parseInt(t3.getText());
                Patient p1 = new Patient(b, t1.getText(), a, t4.getText());
                Patient.writeFile(p1);
                JOptionPane.showMessageDialog(new JFrame(), p1.toString());

            } else if (e.getActionCommand().equals("Display")) {
                ArrayList<Patient> list = Patient.readFromFile();
                for (int i = 0; i < list.size(); i++) {
                    JOptionPane.showMessageDialog(null, list.get(i).toString());
                }

            } else if (e.getActionCommand().equals("Exit")) {
                System.exit(0);

            }
        }

    }

}
