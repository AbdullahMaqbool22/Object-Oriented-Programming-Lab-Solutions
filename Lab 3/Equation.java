class Equation {
   private int a = 0, b = 0, c = 0;

    public void setA(int at){
        a = at;
    }
    public void setB(int bt){
        b = bt;
    }
    public void setC(int ct){
        c = ct;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }


    public Equation() {

    }

    public Equation(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    public void Display() {
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);
        System.out.println("Value of c is: " + c);
    }

    public void setValues(int x, int y, int z) {
        a = x;
        b = y;
        c = z;

    }

    public double getDiscriminant(){
        double val = (b*b)-(4*a*c);
        return val;
    }

    public boolean greater(){
        if(getDiscriminant()>100){
            return true;
        }
        else
            return false;
    }

}
