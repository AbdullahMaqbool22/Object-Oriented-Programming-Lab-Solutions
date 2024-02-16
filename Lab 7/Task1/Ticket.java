class Ticket {
    private int one_way_fare;
    private int two_way_fare;
    private Airplane a1;

    public Ticket() {
        this.one_way_fare = 0;
        this.two_way_fare = 0;
    }

    public Ticket(int one_way_fare, int two_way_fare, Airplane a1) {
        this.one_way_fare = one_way_fare;
        this.a1 = a1;
    }

    public Ticket(int two_way_fare, Airplane a1) {
        this.a1 = a1;
        this.two_way_fare = two_way_fare;
    }

    public int getOne_way_fare() {
        return one_way_fare;
    }

    public void setOne_way_fare(int one_way_fare) {
        this.one_way_fare = one_way_fare;
    }

    public int getTwo_way_fare() {
        return two_way_fare;
    }

    public void setTwo_way_fare(int two_way_fare) {
        this.two_way_fare = two_way_fare;
    }

    public Airplane getA1() {
        return a1;
    }

    public void setA1(Airplane a1) {
        this.a1 = a1;
    }

    public void display() {
        a1.display();
        System.out.println("One way fare is: " + one_way_fare);
        System.out.println("Two way fare is: " + two_way_fare);
    }

    public int totalF(String dep, String arr, String way) {
        int a = 0;
        if (way.equalsIgnoreCase("One way")) {
            if (dep.equalsIgnoreCase("Islamabad") || arr.equalsIgnoreCase("Karachi")) {
                a = one_way_fare + 3500;
            }
        }
        if (way.equalsIgnoreCase("Two way")) {
            if (dep.equalsIgnoreCase("Islamabad") && arr.equalsIgnoreCase("Karachi")) {
                a = two_way_fare + 6500;
            }
        }
        return a;
    }

}
