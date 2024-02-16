public class Retest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4, 4);
        Rectangle r3 = new Rectangle();
        r1.setValues(3, 4);
        r1.Display();
        System.out.println("Area of the rectangle is: " + r1.calcArea());
        System.out.println("Is it a square: " + r1.checkSquare());
        r2.Display();
        System.out.println("Area of the rectangle is: " + r2.calcArea());
        System.out.println("Is it a square: " + r2.checkSquare());
        r3.setLength(5);
        r3.setWidth(4);
        int c = r3.getLength();
        int d = r2.getLength();
        Rectangle r4 = new Rectangle(r3);
        r4.Display();
        System.out.println("Is it same:");
        boolean s = r3.length(r3);
        System.out.println(s);
       
        if (c > d) {
            System.out.println("Rectangle 3 length is greater.");
        } else
            System.out.println("Rectangle 2 length is greater.");
        Rectangle e = r1.compareArea(r2);
        System.out.println("The larger has: ");
        e.Display();
    }

}
