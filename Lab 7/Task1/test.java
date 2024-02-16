public class test {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("Kuwait Airways", 747);
        Ticket t1 = new Ticket(15000, a1);
        Client c1 = new Client("Abdullah", 25, "First Class", 10000, t1);
        Staff s1 = new Staff("Aryan", 40, 17, 100000, a1);
        int a = t1.totalF("Islamabad", "Karachi", "Two way");
        c1.display();
        System.out.println("Total cost of ticket is: " + a);
        System.out.println("Staff of airline is: ");
        s1.display();
    }

}
