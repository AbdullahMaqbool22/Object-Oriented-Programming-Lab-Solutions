class VerifiedSimple extends Simple {
    public VerifiedSimple() {
        super();
    }

    public VerifiedSimple(int a, int b) {
        super(a, b);
    }

    public int add() {
        if (super.getNum1() < 0 || super.getNum2() < 0) {
            System.out.println("error");

        }
        return super.add();
    }

    public int sub() {
        if (super.getNum1() < 0 || super.getNum2() < 0) {
            System.out.println("error");

        }
        return super.sub();
    }

    public int mul() {
        if (super.getNum1() < 0 || super.getNum2() < 0) {
            System.out.println("error");

        }
        return super.mul();
    }

    public int div() {
        if (super.getNum1() < 0 || super.getNum2() < 0) {
            System.out.println("error");
        }
        return super.div();
    }
}
