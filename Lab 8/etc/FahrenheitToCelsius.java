public class FahrenheitToCelsius extends Convert {
    
    public FahrenheitToCelsius() {
        super();
    }

    public FahrenheitToCelsius(double v1, double v2) {
        val1 = v1;
        val2 = v2;
    }

    public double compute() {
        val2 = (val1 - 32) * 5/9;
        return val2;
    }
}
