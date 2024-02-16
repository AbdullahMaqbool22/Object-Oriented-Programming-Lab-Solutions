import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        Time t1 = new Time();
        Time t2 = new Time();
        Point p1 = new Point();
        Point p2 = new Point();
        Book b1 = new Book();
        Book b2 = new Book();
        Result R1 = new Result();
        Result R2 = new Result();
        Account a1 = new Account();
        Student s1 = new Student();

        System.out.println("What do you want to do:");
        System.out.println("account.");
        System.out.println("book.");
        System.out.println("circle.");
        System.out.println("point.");
        System.out.println("rectangle.");
        System.out.println("result.");
        System.out.println("student.");
        System.out.println("time.");
        String u = input.nextLine();
        switch (u) {
            case "circle":
                System.out.println("Enter the radius of circle:");
                double r = input.nextDouble();
                c1.setData(r);
                break;

            case "rectangle":
                System.out.println("Enter the length of rectangle:");
                double l = input.nextDouble();
                System.out.println("Enter the width of rectangle:");
                double w = input.nextDouble();
                r1.setData(l, w);
                break;

            case "time":
                System.out.println("You are user 1 or user 2:");
                int in = input.nextInt();
                switch (in) {
                    case 1:
                        System.out.println("Enter hours: ");
                        int h = input.nextInt();

                        System.out.println("Enter minute: ");
                        int m = input.nextInt();

                        System.out.println("Enter second: ");
                        int s = input.nextInt();
                        t1.setData(h, m, s);
                        t1.showData();
                        t1.convertToSec();
                        break;

                    case 2:
                        System.out.println("Enter hours: ");
                        int k = input.nextInt();

                        System.out.println("Enter minute: ");
                        int g = input.nextInt();

                        System.out.println("Enter second: ");
                        int b = input.nextInt();

                        t2.setData(k, g, b);
                        t2.showData();
                        t2.convertToSec();

                        break;
                }

                break;

            case "point":

                System.out.println("Enter x coordinates: ");
                int a = input.nextInt();
                System.out.println("Enter y coordinates: ");
                int z = input.nextInt();
                p1.setData(a, z);
                p1.showInfo();
                System.out.println("Enter displacement at x and y:");
                int e = input.nextInt();
                int j = input.nextInt();
                p1.movePoint(e, j);

                System.out.println("User 2:");

                System.out.println("Enter x coordinates: ");
                int d = input.nextInt();
                p2.x = d;
                System.out.println("Enter y coordinates: ");
                int y = input.nextInt();
                p2.y = y;
                p2.setData(d, y);
                p2.showInfo();
                System.out.println("Enter displacement at x and y:");
                int i = input.nextInt();
                int n = input.nextInt();
                p2.movePoint(i, n);

                break;

            case "book":
                System.out.println("Enter author name: ");
                String kk = input.nextLine();

                System.out.println("Enter title name: ");
                String kd = input.nextLine();

                System.out.println("Enter pages: ");
                int kv = input.nextInt();

                b1.setData(kk, kd, kv);
                b1.showData();
                b1.check();

                System.out.println("User 2.");

                System.out.println("Enter author name: ");
                String kt = input.nextLine();

                System.out.println("Enter title name: ");
                String kl = input.nextLine();

                System.out.println("Enter pages: ");
                int kg = input.nextInt();

                b2.setData(kt, kl, kg);
                b2.showData();
                b2.check();

                break;

            case "result":

                R1.setData(100, 90, 30);
                R1.showValue();
                R1.showPer();
                R1.showSum();

                System.out.println("User 2.");

                R2.setData(40, 60, 70);
                R2.showValue();
                R2.showPer();
                R2.showSum();

                break;

            case "account":
                a1.setData(5000);
                a1.showBalance();
                System.out.println("Enter amount to deposit:");
                int jl = input.nextInt();
                a1.deposit(jl);
                System.out.println("Enter amount to withdraw:");
                int jd = input.nextInt();
                a1.withdraw(jd);
                break;

            case "student":
                System.out.println("Enter your name: ");
                String sl = input.nextLine();

                System.out.println("Enter your email: ");
                String sk = input.nextLine();

                System.out.println("Enter your courses you want to study: ");
                for (int k = 0; k < 3; k++) {
                    s1.course[k] = input.nextLine();
                }
                s1.setData(sl, sk, s1.course);

                System.out.println("Do you want to add any course(Y/N): ");
                String tk = input.nextLine();
                if (tk.equals("Y")) {
                    System.out.println("Enter the subject you want to study:");
                    String dd = input.nextLine();
                    s1.add(dd);
                } else
                    System.out.println("Thanks.");

                s1.showData(sl, sk, s1.course);
                break;

            default:
                System.out.println("Error.");

        }

        input.close();
    }
}
