class Rectangle {
    double width;
    double length;
    double area;

    public void showArea() {
        area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }

    public void showData(int x) {
        System.out.println("The at the point data is: " + x);
    }

    public void setData(double a, double b) {
        length = a;
        width = b;
        showArea();
    }
}
