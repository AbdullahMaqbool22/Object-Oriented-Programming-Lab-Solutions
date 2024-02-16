public class test1 {
    public static void main(String[] args) {
        Laptop l1 = new Laptop(512, 1024, 14, 16);
        Computer c1 = new Computer(512 , 1024);
        c1.Display();
        System.out.println("Specs of laptop are: " + l1.toString());
    } 
    
}
