import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A string: ");
        String l1 = input.nextLine();
        String re = replace(l1);
        System.out.println(re);

        input.close();
        
    }
    public static String replace(String a) {
       String b = a.replace('O', 'T');
       return b;
    }
    
}
