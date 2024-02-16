import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int[6];
        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter your value for the place " + i + " or enter 0 to exit.");
            arr[i]=input.nextInt();
        }
        System.out.println("Highest value in array is: ");
        hval(arr);
        System.out.println("Lowest value in array is: ");
        lval(arr);
        input.close();
    }
    public static void hval(int [] a) {
        int count = 0;
        for(int i = 1; i<a.length; i++){
            if(a[i]>a[i-1]){
                count = a[i];
            }
           
        }
         System.out.println(count);
        
    }
    public static void lval(int [] a) {
        int count = 0;
        for(int i = 1; i<a.length; i++){
            if(a[i]<a[i-1]){
                count = a[i];
            }
           
        }
         System.out.println(count);
        
    }
}
