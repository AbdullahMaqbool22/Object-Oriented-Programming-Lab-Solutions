import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGUI extends JFrame {
    JButton Button1;

    public SimpleGUI() {
        setSize(2160, 1440);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        Button1 = new JButton("Click me");
        MyActionListener a = new MyActionListener();
        Button1.addActionListener(a);
        add(Button1);
    }

}
