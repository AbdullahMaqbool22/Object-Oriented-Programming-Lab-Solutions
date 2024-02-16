class Simple {
    protected int num1;
    protected int num2;

    public Simple() {
        num1 = 0;
        num2 = 0;
    }

    public Simple(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public int sub() {
        return num1 - num2;
    }

    public int mul() {
        return num1 * num2;
    }

    public int div() {
        return num1 / num2;
    }

    public void Display() {
        System.out.println("By adding numbers is: " + add());
        System.out.println("By subtracting number: " + sub());
        System.out.println("By multiplying number: " + mul());
        System.out.println("By dividing we get: " + div());
    }

    public String toString() {
        return "Simple [num1=" + num1 + ", num2=" + num2 + "]";
    }

}
