import java.util.Scanner;

public class Eqtest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Equation e1 = new Equation();
        Equation e2 = new Equation(5, 7, -1);
        System.out.println("Enter the value of a: ");
        int st = input.nextInt();
        System.out.println("Enter the value of b: ");
        int sd = input.nextInt();
        System.out.println("Enter the value of c: ");
        int sk = input.nextInt();
        e1.setValues(st, sd, sk);
        e1.Display();
        System.out.println("the discriminant of the equation is: " + e1.getDiscriminant());
        System.out.println("Is disc greater then 100: " + e1.greater());

        e2.Display();
        System.out.println("the discriminant of the equation is: " + e2.getDiscriminant());
        System.out.println("Is disc greater then 100: " + e2.greater());
        input.close();
    }

}
