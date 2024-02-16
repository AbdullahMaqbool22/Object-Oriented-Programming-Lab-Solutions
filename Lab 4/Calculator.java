class Calculator {
    public static int sum;
    public static int multiply;
    public static double divide;
    public static double modulus;

    public Calculator() {

    }

    public Calculator(int a, int b, double c, double d) {
        Calculator.sum = a;
        Calculator.multiply = b;
        Calculator.divide = c;
        Calculator.modulus = d;

    }

    public static int getSum() {
        return sum;
    }

    public static void setSum(int sum) {
        Calculator.sum = sum;
    }

    public static int getMultiply() {
        return multiply;
    }

    public static void setMultiply(int multiply) {
        Calculator.multiply = multiply;
    }

    public static double getDivide() {
        return divide;
    }

    public static void setDivide(double divide) {
        Calculator.divide = divide;
    }

    public static double getModulus() {
        return modulus;
    }

    public static void setModulus(double modulus) {
        Calculator.modulus = modulus;
    }

    public int sum(int a1, int b1) {
        return a1 + b1;
    }

    public int multiply(int a1, int b1) {
        return a1 * b1;
    }

    public double divide(double a1, double b1) {
        return a1 / b1;
    }

    public double modulus(double a1, double b1) {
        return a1 % b1;
    }
}
