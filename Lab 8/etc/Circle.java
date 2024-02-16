public class Circle implements Shape {
    
    private double radius;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public double getArea() {
        double area = Pi * Math.pow(radius, 2);
        return area;
    }
}
