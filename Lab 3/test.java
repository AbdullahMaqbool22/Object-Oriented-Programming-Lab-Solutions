import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account a1 = new Account();
        Account a2 = new Account();
        
        a1.setValues(1500, 1990, 1000202392);
        a1.Display();
        System.out.println("Your amount is now: " +a1.withdraw(100) );
        System.out.println("Your amount is now: " +a1.deposit(2000) );
        System.out.println("The age of account is: " +  a1.calculateAge()); 
        System.out.println("The balance in second account is: ");
        a2.setBalance(a1.getBalance());
        a2.Display();       
        input.close();

    }

}
