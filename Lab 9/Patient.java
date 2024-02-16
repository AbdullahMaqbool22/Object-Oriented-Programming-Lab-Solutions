import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Patient extends Person implements Serializable {
    private String illness;

    public Patient() {
        super(0, "b", 0);
        this.illness = "abc";
    }


    public Patient(int iD, String name, int age, String illness) {
        super(iD, name, age);
        this.illness = illness;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String toString() {
        return super.toString() + " illness=" + illness + "]";
    }

    public static void writeFile(Patient p1) {
        try {
            File f = new File("D:\\University Stuff\\Abdullah University-3\\OOP\\Lab\\Lab Work\\Lab 9\\Patient.ser");
            ObjectOutputStream oos;
            if (f.exists()) {
                oos = new MyObjectOutputStream(new FileOutputStream(f, true));
            } else {
                oos = new ObjectOutputStream(new FileOutputStream(f));
            }
            oos.writeObject(p1);
        } catch (IOException e) {
            System.out.println("Error in writing to file!");
        }
    }

    public static ArrayList<Patient> readFromFile() {
        ArrayList<Patient> plist = new ArrayList<Patient>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                    "D:\\University Stuff\\Abdullah University-3\\OOP\\Lab\\Lab Work\\Lab 9\\Patient.ser"));
            while (true) {
                Patient p1 = (Patient) ois.readObject();
                plist.add(p1);
                System.out.println(p1.toString());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException!");
        } catch (EOFException e) {
            return plist;
        } catch (IOException e) {
            System.out.println("IOException!");
        }
        return null;
    }

    public static void delPatient(int ID) {
        ArrayList<Patient> list = readFromFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() == ID) {
                list.remove(i);
                break;
            }
        }
        try {
            File f = new File("D:\\University Stuff\\Abdullah University-3\\OOP\\Lab\\Lab Work\\Lab 9\\Patient.ser");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            for (int i = 0; i < list.size(); i++) {
                oos.writeObject(list.get(i));
            }
        } catch (IOException e) {
            System.out.println("IOException!");
        }

    }

    public static void updateIllnessOfObject(int ID, String illness) {
        ArrayList<Patient> list = readFromFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() == ID) {
                list.get(i).setIllness(illness);
            }
        }
        try {
            File f = new File("D:\\University Stuff\\Abdullah University-3\\OOP\\Lab\\Lab Work\\Lab 9\\Patient.ser");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            for (int i = 0; i < list.size(); i++) {
                oos.writeObject(list.get(i));
            }
        } catch (IOException e) {
            System.out.println("IOException!");
        }
    }

    public static void displayPatient() {
        ArrayList<Patient> list = readFromFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() != 0) {
                System.out.println(list.get(i));
            }

        }
    }

    public static boolean searchFromFile(int ID) {
        boolean flag = false;
        ArrayList<Patient> list = readFromFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() == ID) {
                flag = true;
            }
        }
        return flag;
    }

    public String display(){
        return "Patient data is"+ "\n" + "Patient ID is: " + ID + "\n" + "Patient name is : " + name + " \n" + "Patient age is: " + age + "\n" + "Patient Illness is: " + illness;
    }

}
