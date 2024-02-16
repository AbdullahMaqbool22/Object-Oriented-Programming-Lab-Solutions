public class LitresToGallons extends Convert {
    
    public LitresToGallons() {
        super();
    }

    public LitresToGallons(double v1, double v2) {
        super(v1, v2);
    }

    public double compute() {
        val2 = val1 / 0.264172;
        return val2;
    }
}
