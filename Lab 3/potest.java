public class potest {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 4);
        Point p3 = new Point(4, 5);
        p1.setX(3);
        p1.setY(2);
        p2.display();
        p1.display();
        p1.movePoint(2, 5);
        System.out.println("Are points on origin: " + p1.checkOrigin() );
        System.out.println("By adding two points we get:");
        Point e = p1.addTwo(p2);
        e.display();
        System.out.println("By adding three points we get: ");
        Point d = p1.addThree(p2, p3);
        d.display();
        Point p4 = new Point(p1);
        p4.display();
        System.out.println("are they same: ");
        boolean l = p1.equal(p1);
        System.out.println(l);


    }
    
}
