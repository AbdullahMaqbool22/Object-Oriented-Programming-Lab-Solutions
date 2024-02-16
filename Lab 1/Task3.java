import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first String:");
        String l1 = input.nextLine();
        System.out.println("Enter the second String:");
        String l2 = input.nextLine();
        String l3 = cat(l1, l2);
        System.out.println("The merged string is: " + l3);

        input.close();

    }

    public static String cat(String a, String b) {
        String c = a + " " + b;
        return c;
    }

}
