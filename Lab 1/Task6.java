import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int[11];
        System.out.println("Enter the assessment of your telephone service:");
        System.out.println("1 for excellent Service");
        System.out.println("2 for Good Service");
        System.out.println("3 for Average Service");
        System.out.println("4 for Below Average Service");
        System.out.println("5 for poor Service");
        for(int i = 1; i<arr.length; i++){
            System.out.println("User: " + i);
            arr[i]=input.nextInt();
        }
        rate(arr);

        input.close();

        
    }
    
    public static void rate(int [] arr) {
        int ecount = 0, gcount = 0, acount = 0, bacount = 0, pcount = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==1){
                ecount++;
            }
            if(arr[i]==2){
                gcount++;
            }
            if(arr[i]==3){
                acount++;
            }
            if(arr[i]==4){
                bacount++;
            }
            if(arr[i]==5){
                pcount++;
            }
        }
        System.out.println("Users found the service excellent:");
            System.out.println(ecount);
        System.out.println("Users found the service good:");
            System.out.println(gcount);
        System.out.println("Users found the service average:");
            System.out.println(acount);
        System.out.println("Users found the service below average:");
            System.out.println(bacount);
        System.out.println("Users found the service poor:");
            System.out.println(pcount);
    }

    
}
