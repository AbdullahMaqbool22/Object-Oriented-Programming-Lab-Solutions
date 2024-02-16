class Circle {
    double radius;

    public void calcRadius() {
        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }

    public void showData(int x) {
        System.out.println("The at the point data is: " + x);
    }

    public void setData(double x) {
        radius = x;
        calcRadius();
    }
}