import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter your value for the place " + i + " or enter 0 to exit.");
            arr[i] = input.nextInt();
            if (arr[i] == 0) {
                break;
            }
        }
        int eval = evenValue(arr);
        int oval = oddValue(arr);
        System.out.println("The even values in the array are:");
        System.out.println(eval);
        System.out.println("The odd values in the array are:");
        System.out.println(oval);
        input.close();
    }

    public static int evenValue(int[] a) {
        int ecount = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                ecount++;
            }

        }
        return ecount;

    }

    public static int oddValue(int[] a) {
        int ocount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                ocount++;
            }

        }
        return ocount;

    }
}
