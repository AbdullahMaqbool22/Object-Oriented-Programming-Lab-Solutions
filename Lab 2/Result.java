class Result {
    int m1, m2, m3;

    public void showValue() {
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }

    public void setData(int a, int b, int c) {
        m1 = a;
        m2 = b;
        m3 = c;

    }

    public void showSum() {
        System.out.println(m1 + m2 + m3);
    }

    public void showPer() {
        System.out.println((m1 + m2 + m3) * 100 / 300);
    }

    public void showData(int x) {
        System.out.println("The at the point data is: " + x);
    }

}
