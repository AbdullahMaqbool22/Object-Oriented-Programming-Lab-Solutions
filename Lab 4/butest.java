public class butest {
    public static void main(String[] args) {
        Bus b1 = new Bus(1, "Islamabad", "Khanewal", 1000.0);
        Bus b2 = new Bus(1, "Islamabad", "Khanewal", 1000.0);
        b1.Reserve("Abdullah");
        b1.Reserve("Faiq");
        b1.Reserve("Ali");
        b1.cancelReservation("Abdullah");
        b1.cancelReservation("Faiq");
        b1.compareBus(b1, b2);
    }

}
