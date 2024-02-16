public class TestGeometricCollection {
    public static void main(String[] args) {
       Circle[] shapes = new Circle[10];

        for (int i = 0; i < 10; i++) {
            shapes[i] = new Circle(i + 1);
        }

        GeometricCollection g1 = new GeometricCollection(shapes);
        g1.display();
        System.out.println("Total area is: " + g1.totalArea());


        g1.display1();
    }
}
