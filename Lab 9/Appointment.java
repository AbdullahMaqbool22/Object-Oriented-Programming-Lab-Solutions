import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Appointment implements Serializable {
    private Date d1;
    private Patient p1;
    private Doctor a2;

    public Appointment(Date d1, Patient p1, Doctor a2) {
        this.d1 = d1;
        this.p1 = p1;
        this.a2 = a2;
    }
    public Appointment(int a, Date d1, int b){
        this.d1 = d1;
        int f = this.p1.getID();
        f = a;
        int d = this.a2.getID();
        d = b;
    }

    public Date getD1() {
        return d1;
    }

    public void setD1(Date d1) {
        this.d1 = d1;
    }

    public Patient getP1() {
        return p1;
    }

    public void setP1(Patient p1) {
        this.p1 = p1;
    }

    public Doctor getA2() {
        return a2;
    }

    public void setA2(Doctor a2) {
        this.a2 = a2;
    }

    public String toString() {
        return "Appointment [d1=" + d1 + ", p1=" + p1 + ", a2=" + a2 + "]";
    }

    public static void writeFile(Appointment a1) {
        try {
            File f = new File(
                    "D:\\University Stuff\\Abdullah University-3\\OOP\\Lab\\Lab Work\\Lab 9\\Appointment.ser");
            ObjectOutputStream oos;
            if (f.exists()) {
                oos = new MyObjectOutputStream(new FileOutputStream(f, true));
            } else {
                oos = new ObjectOutputStream(new FileOutputStream(f));
            }
            oos.writeObject(a1);
        } catch (IOException e) {
            System.out.println("Error in writing to file!");
        }
    }

    public static ArrayList<Appointment> readFromFile() {
        ArrayList<Appointment> aList = new ArrayList<Appointment>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                    "D:\\University Stuff\\Abdullah University-3\\OOP\\Lab\\Lab Work\\Lab 9\\Appointment.ser"));

            while (true) {
                Appointment a1 = (Appointment) ois.readObject();
                aList.add(a1);
                System.out.println(a1.toString());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error");
        } catch (EOFException e) {
            return aList;
        } catch (IOException e) {
            System.out.println("Error");
        }
        return null;
    }

    public static void delAppointment(int ID) {
        ArrayList<Appointment> list = readFromFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).p1.getID() == ID) {
                list.remove(i);
                break;
            }
        }
        try {
            File f = new File(
                    "D:\\University Stuff\\Abdullah University-3\\OOP\\Lab\\Lab Work\\Lab 9\\Appointment.ser");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            for (int i = 0; i < list.size(); i++) {
                oos.writeObject(list.get(i));
            }
        } catch (IOException e) {
            System.out.println("IOException!");
        }

    }

    public static void updateAppointmentOfObject(int ID, Date d2) {
        ArrayList<Appointment> list = readFromFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).p1.getID() == ID) {
                list.get(i).d1.setDay(d2.getDay());
                list.get(i).d1.setMonth(d2.getMonth());
                list.get(i).d1.setMonth(d2.getMonth());
            }
        }
        try {
            File f = new File(
                    "D:\\University Stuff\\Abdullah University-3\\OOP\\Lab\\Lab Work\\Lab 9\\Appointment.ser");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            for (int i = 0; i < list.size(); i++) {
                oos.writeObject(list.get(i));
            }
        } catch (IOException e) {
            System.out.println("IOException!");
        }
    }

    public static void displayAppointment() {
        ArrayList<Appointment> list = readFromFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).p1.getID() != 0) {
                System.out.println(list.get(i).p1.toString());
            }

        }
    }

    public static boolean searchFromFile(int ID) {
        boolean flag = false;
        ArrayList<Appointment> list = readFromFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).p1.getID() == ID) {
                flag = true;
            }
        }
        return flag;
    }

}
