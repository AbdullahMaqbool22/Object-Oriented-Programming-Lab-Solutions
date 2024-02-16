import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A string: ");
        String l1 = input.nextLine();
        extract(l1);
        input.close();
       
    }
    public static void extract(String a) {
        int x = a.indexOf('@');
        String b = a.substring(0, x);
        System.out.println(b);

       
    }
    
}
