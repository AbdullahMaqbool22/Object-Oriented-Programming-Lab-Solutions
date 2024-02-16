import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Doctor extends Person implements Serializable {
    private String specialization;

    public Doctor() {
        super(0, "b", 0);
        this.specialization = null;
    }

    public Doctor(int iD, String name, int age, String specialization) {
        super(iD, name, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String toString() {
        return super.toString() + " specialization=" + specialization + "]";
    }

    public static void writeFile(Doctor d1) {
        try {
            File f = new File("D:\\University Stuff\\Abdullah University-3\\OOP\\Lab\\Lab Work\\Lab 9\\Doctor.ser");
            ObjectOutputStream oos;
            if (f.exists()) {
                oos = new MyObjectOutputStream(new FileOutputStream(f, true));
            } else {
                oos = new ObjectOutputStream(new FileOutputStream(f));
            }
            oos.writeObject(d1);
        } catch (IOException e) {
            System.out.println("Error in writing to file!");
        }
    }

    public static ArrayList<Doctor> readFromFile() {
        ArrayList<Doctor> dList = new ArrayList<Doctor>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                    "D:\\University Stuff\\Abdullah University-3\\OOP\\Lab\\Lab Work\\Lab 9\\Doctor.ser"));

            while (true) {
                Doctor d1 = (Doctor) ois.readObject();
                dList.add(d1);
                System.out.println(d1.toString());
            }
        } catch (ClassNotFoundException e) {

        } catch (EOFException e) {
            return dList;
        } catch (IOException e) {

        }
        return null;
    }

    public static void delDoctor(int ID) {
        ArrayList<Doctor> list = readFromFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() == ID) {
                list.remove(i);
                break;
            }
        }
        try {
            File f = new File("D:\\University Stuff\\Abdullah University-3\\OOP\\Lab\\Lab Work\\Lab 9\\Doctor.ser");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            for (int i = 0; i < list.size(); i++) {
                oos.writeObject(list.get(i));
            }
        } catch (IOException e) {
            System.out.println("IOException!");
        }

    }

    public static void updateIllnessOfObject(int ID, String specialization) {
        ArrayList<Doctor> list = readFromFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() == ID) {
                list.get(i).setSpecialization(specialization);
                ;
            }
        }
        try {
            File f = new File("D:\\University Stuff\\Abdullah University-3\\OOP\\Lab\\Lab Work\\Lab 9\\Doctor.ser");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            for (int i = 0; i < list.size(); i++) {
                oos.writeObject(list.get(i));
            }
        } catch (IOException e) {
            System.out.println("IOException!");
        }
    }

    public static void displayDoctor() {
        ArrayList<Doctor> list = readFromFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() != 0) {
                System.out.println(list.get(i));
            }

        }
    }

    public static boolean searchFromFile(int ID) {
        boolean flag = false;
        ArrayList<Doctor> list = readFromFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() == ID) {
                flag = true;
            }
        }
        return flag;
    }
}
