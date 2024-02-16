public class FeetToMeteres extends Convert {

    public FeetToMeteres() {
        super();
    }

    public FeetToMeteres(double v1, double v2) {
        super(v1, v2);
    }

    public double compute() {
        val2 = val1 / 3.281;
        return val2;
    }
    
}
