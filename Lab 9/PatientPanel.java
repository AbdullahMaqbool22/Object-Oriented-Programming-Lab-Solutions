import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PatientPanel extends JFrame {
    JPanel p1, p2;
    JButton b1, b2, b3, b4, b5, b6;

    public PatientPanel() {
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(2, 1));
        p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 1));
        p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 2));
        b1 = new JButton("Add Patient");
        b2 = new JButton("Read All");
        b3 = new JButton("Delete Patient");
        b4 = new JButton("Search Patient");
        b5 = new JButton("Cancel");
        b6 = new JButton("Home");
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p2.add(b5);
        p2.add(b6);
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        MyActionListener a = new MyActionListener();
        b1.addActionListener(a);
        b2.addActionListener(a);
        b3.addActionListener(a);
        b4.addActionListener(a);
        b5.addActionListener(a);
        b6.addActionListener(a);

    }

    public class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equalsIgnoreCase("Add Patient")) {
                dispose();
                new PatientEntryFormFrame();
            } else if (e.getActionCommand().equalsIgnoreCase("Read All")) {
                dispose();
                ArrayList<Patient> list = Patient.readFromFile();
                for (int i = 0; i < list.size(); i++) {
                    JOptionPane.showMessageDialog(null, list.get(i).toString());
                }

            } else if (e.getActionCommand().equalsIgnoreCase("Delete Patient")) {
                dispose();
                new DelPatient();
            } else if (e.getActionCommand().equalsIgnoreCase("Search Patient")) {
                dispose();
                new SerPatient();
            } else if (e.getActionCommand().equalsIgnoreCase("Cancel")) {
                System.exit(0);
            } else if (e.getActionCommand().equalsIgnoreCase("Home")) {
                dispose();
                new Home();
            }

        }
    }

}
