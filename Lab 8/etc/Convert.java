public abstract class Convert {
    
    protected double val1;
    protected double val2;
    
    public Convert() {
        val1 = 0; 
        val2 = 0;
    }

    public Convert(double v1, double v2) {
        val1 = v1;
        val2 = v2;
    }

    public double getVal1() {
        return val1;
    }

    public void setVal1(double val1) {
        this.val1 = val1;
    }

    public double getVal2() {
        return val2;
    }

    public void setVal2(double val2) {
        this.val2 = val2;
    }

    public abstract double compute();

}
