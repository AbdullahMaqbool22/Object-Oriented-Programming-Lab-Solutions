class Static {
    public static int numCircles = 0;
    private double x, y, r;

    public Static() {
        numCircles++;
    }

    public static int getNumCircles() {
        return numCircles;
    }

    public static void setNumCircles(int numCircles) {
        Static.numCircles = numCircles;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Static(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
        numCircles++;
    }

    public void Display(){
        System.out.println(numCircles);
        System.out.println(x);
        System.out.println(y);
        System.out.println(r);
    }
}
