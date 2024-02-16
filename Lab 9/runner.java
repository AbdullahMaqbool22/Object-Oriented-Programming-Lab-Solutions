public class runner {
    public static void main(String[] args) {
        Patient p1 = new Patient(1234, "Abdullah", 50, "Heart Patient");
        Patient p2 = new Patient(1239, "Ali", 50, "Heart Patient");

        Doctor d1 = new Doctor(5678, "Asif", 40, "Heart Surgeon");
        Doctor d2 = new Doctor(5677, "Ayb", 40, "Heart Surgeon");

        Date da1 = new Date(5, 12, 2023);
        Date da2 = new Date(4, 12, 2023);

        Appointment a1 = new Appointment(da1, p1, d1);
        Appointment a2 = new Appointment(da2, p2, d2);

        Patient.writeFile(p1);
        Patient.writeFile(p2);

        Doctor.writeFile(d1);

        Appointment.writeFile(a1);
        Appointment.writeFile(a2);

        Appointment.displayAppointment();

    }

}
