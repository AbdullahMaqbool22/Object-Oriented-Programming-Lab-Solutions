class Account {
    private int balance;
    private int yearOfOpening;
    private long CNIC;

    public void setBalance(int bal) {
        if (bal > 0) {
            balance = bal;
        }
    }

    public void setYear(int year) {
        if (year > 1985) {
            yearOfOpening = year;
        }
    }

    public void setCNIC(long cnic) {
        if (cnic > 0) {
            CNIC = cnic;
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getYear() {
        return yearOfOpening;
    }

    public long getCNIC() {
        return CNIC;
    }

    public Account() {

    }

    public Account(int x) {
        balance = x;
    }

    public Account(int a, int b, long c) {
        balance = a;
        yearOfOpening = b;
        CNIC = c;
    }

    public void setValues(int a, int b, long c) {
        if (a > 0 && b>1985 && c>0) {
            balance = a;
            yearOfOpening = b;
            CNIC = c;
        }
        else {
            System.out.println("Invalid value."); 
        }

    }

    public void Display() {
        System.out.println("Your balance is: " + balance);
        System.out.println("Your CNIC is: " + CNIC);
        System.out.println("The date when account was opened: " + yearOfOpening);
    }

    public int withdraw(int a) {
        if (a <= balance) {
            balance = balance - a;
        } else {
            System.out.println("Amount is not there.");
        }
        return balance;
    }

    public int deposit(int a) {
        if (balance >= 100) {
            balance = balance + a;
        } else {
            System.out.println("Amount should be greater then 100Rs.");
        }

        return balance;
    }

    public int calculateAge() {
        int age = 2023 - yearOfOpening;
        return age;

    }

}
