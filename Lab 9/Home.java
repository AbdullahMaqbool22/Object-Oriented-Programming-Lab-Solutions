import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Home extends JFrame {
    JButton b1, b2, b3;

    public Home() {
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(3, 1));
        b1 = new JButton("Patient Panel");
        b2 = new JButton("Doctor Panel");
        b3 = new JButton("Appointment Panel");
        add(b1);
        add(b2);
        add(b3);
        MyActionListener a = new MyActionListener();
        b1.addActionListener(a);
        b2.addActionListener(a);
        b3.addActionListener(a);

    }

    public class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equalsIgnoreCase("Patient Panel")) {
                dispose();
                new PatientPanel();

            } else if (e.getActionCommand().equalsIgnoreCase("Doctor Panel")) {
                dispose();
                new DoctorPanel();
            } else if (e.getActionCommand().equalsIgnoreCase("Appointment Panel")) {
                dispose();
            }
        }

    }

}
