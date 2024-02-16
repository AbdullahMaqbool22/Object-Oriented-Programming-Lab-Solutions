public class test5 {
    public static void main(String[] args) {
        Person p1 = new Person("Abdullah", 30);
        Truck t1 = new Truck(p1, "Ford", 6, 2000, 1500);
        t1.Display();
    }

}
