public class test {
    public static void main(String[] args) {
        Patient p1 = new Patient(1234, "Abdullah", 50, "Heart Patient");
        Patient p2 = new Patient(1239, "Ali", 50, "Heart Patient");
        Patient p3 = new Patient(1230, "Asif", 50, "Heart Patient");
        // Doctor d1 = new Doctor(5678, "Asif", 40, "Heart Surgeon");
        // Date da1 = new Date(5, 12, 2023);
        // Appointment a1 = new Appointment(da1, p1, d1);
        Patient.writeFile(p1);

        Patient.writeFile(p2);
        Patient.writeFile(p3);
        Patient.readFromFile();
        // Doctor.writeFile(d1);
        // Doctor.readFromFile();
        // Appointment.writeFile(a1);
        // Appointment.readFromFile();
        System.out.println("Deleted 1234");
        Patient.delPatient(1234);
        Patient.readFromFile();
        System.out.println("Updated Illness");
        Patient.updateIllnessOfObject(1239, "Brain Patient");
        Patient.readFromFile();
        System.out.println("All the patients");
        Patient.displayPatient();
        System.out.println("Search Patient");
        System.out.println(Patient.searchFromFile(1230));

        
    }

}
