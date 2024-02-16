import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int [] arr = new int[6];
        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter your value for the place " + i + " or enter 0 to exit.");
            arr[i]=input.nextInt();
            if(arr[i]==0){
                break;
            }
            count++;
        }
        double rval = average(arr, count);
        System.out.println(rval);
        input.close();
    }
    public static int sums(int [] a) {
        int count = 0; 
        for(int i = 0; i<a.length; i++){
            count+=a[i];
        }
        return count;
    }
    public static double average(int [] a, int sum){
        if(sum == 0){
            return 0;
        }
        int count = 0;
        
         for(int i = 0; i<a.length; i++){
            
            count+=a[i];
        }
        
        return (double) count/sum;
    }
    
}


