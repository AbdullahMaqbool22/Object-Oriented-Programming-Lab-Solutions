class Point {
    int x, y;

    public void showInfo() {
        System.out.println(x);
        System.out.println(y);
    }

    public void movePoint(int dx, int dy) {
        System.out.println(x + dx);
        System.out.println(y + dy);

    }

    public void showData(int x) {
        System.out.println("The at the point data is: " + x);
    }

    public void setData(int a, int b) {
        x = a;
        y = b;

    }
}
