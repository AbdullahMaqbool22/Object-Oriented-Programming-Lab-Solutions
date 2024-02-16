public class Rectangle implements Shape{
    private double lenght;
    private double width;

    public Rectangle() {
        this.lenght = 0;
        this.width = 0;
    }

    public Rectangle(double l, double w) {
        this.lenght = l;
        this.width = w;
    }
    
    public double getLenght() {
        return lenght;
    }

    public void setLenght(double l) {
        this.lenght = l;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public double getArea() {
        double area = lenght * width;
        return area;
    }

}
