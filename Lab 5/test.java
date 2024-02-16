public class test {
    public static void main(String[] args) {
        Date d1 = new Date(22, 8, 1990);
        Date d2 = new Date(22, 8, 2004);
        Job j1 = new Job("CEO", 70000, 1989);
        Employee e1 = new Employee("Abdullah", d1, d2, j1);
        e1.Display();
    }
    
}
