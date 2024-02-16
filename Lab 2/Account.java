class Account {
    int balance;

    public void showBalance() {
        System.out.println("Total balance is: " + balance);
    }

    public void deposit(int x) {
        balance = balance + x;
        System.out.println("Your new balance is: " + balance);
    }

    public void withdraw(int x) {
        int n = balance - x;
        System.out.println("Your new balance is: " + n);
    }

    public void setData(int x) {
        x = balance;
    }

    public void showData(int x) {
        System.out.println("The at the point data is: " + x);
    }

}
