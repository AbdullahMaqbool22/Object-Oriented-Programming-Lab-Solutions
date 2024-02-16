import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddAppointment extends JFrame {
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField t1, t2, t3, t4, t5, t6, t7;
    JButton b1, b2, b3;
    JPanel p1, p2;

    public AddAppointment() {
        setTitle("Appointment Entry.");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(2, 1));
        p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 2));
        p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 3));
        l1 = new JLabel("Enter Patient ID: ");
        t1 = new JTextField(20);
        l2 = new JLabel("Enter Doctor ID: ");
        t2 = new JTextField(20);
        l5 = new JLabel("Enter Date:");
        t5 = new JTextField(20);
        l6 = new JLabel("Enter Month: ");
        t6 = new JTextField(20);
        l7 = new JLabel("Enter Year: ");
        t7 = new JTextField(20);
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
        p1.add(l5);
        p1.add(t5);
        p1.add(l6);
        p1.add(t6);
        p1.add(l7);
        p1.add(t7);

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
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = Integer.parseInt(t5.getText());
                int d = Integer.parseInt(t6.getText());
                int f = Integer.parseInt(t7.getText());
                Date d1 = new Date(c, d, f);
                Appointment a1 = new Appointment(a, d1, b);
                Appointment.writeFile(a1);
                JOptionPane.showMessageDialog(new JFrame(), p1.toString());

            } else if (e.getActionCommand().equals("Display")) {
                ArrayList<Appointment> list = Appointment.readFromFile();
                for (int i = 0; i < list.size(); i++) {
                    JOptionPane.showMessageDialog(null, list.get(i).toString());
                }

            } else if (e.getActionCommand().equals("Exit")) {
                System.exit(0);

            }
        }

    }

}
