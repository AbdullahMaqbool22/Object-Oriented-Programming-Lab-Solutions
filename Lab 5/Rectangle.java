public class Rectangle {
    private double len;
    private double wid;
 
    public Rectangle() {
        this.len = 0;
        this.wid = 0;
    }

    public Rectangle(double len, double wid) {
        this.len = len;
        this.wid = wid;
    }

    public void setLen(double len) {
        this.len = len;
    }
    
    public void setWid(double wid) {
        this.wid = wid;
    }

    public double getLen() {
        return len;
    }

    public double getWid() {
        return wid;
    }

    public double area() {
        double a = len * wid;
        return a;
    }
}
