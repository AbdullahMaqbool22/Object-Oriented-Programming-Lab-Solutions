import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The first value:");
        int num1 = input.nextInt();
        System.out.println("Enter The second value:");
        int num2 = input.nextInt();
        System.out.println("The Squared value is:");
        System.out.println(power(num1, num2));
        input.close();
    }

    public static int power(int a, int b) {
        int pow = (int) Math.pow(a, b);
        return pow;
    }
}
