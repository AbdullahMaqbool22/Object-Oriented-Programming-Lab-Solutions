class Truck extends Vehicle {
    protected double loadCap;
    protected int towCap;

    public Truck() {
        loadCap = 0;
        towCap = 0;
    }

    public Truck(double loadCap, int towCap) {
        this.loadCap = loadCap;
        this.towCap = towCap;
    }

    public Truck(String nameMan, int noOfCyl, double loadCap, int towCap) {
        super(nameMan, noOfCyl);
        this.loadCap = loadCap;
        this.towCap = towCap;
    }

    public Truck(Person p1, String nameMan, int noOfCyl, double loadCap, int towCap) {
        super(p1, nameMan, noOfCyl);
        this.loadCap = loadCap;
        this.towCap = towCap;
    }

    public double getLoadCap() {
        return loadCap;
    }

    public void setLoadCap(double loadCap) {
        this.loadCap = loadCap;
    }

    public int getTowCap() {
        return towCap;
    }

    public void setTowCap(int towCap) {
        this.towCap = towCap;
    }

    public String toString() {
        return super.toString() + " loadCap=" + loadCap + ", towCap=" + towCap + "]";
    }

    public void Display() {
        super.Display();
        System.out.println("Load Capacity of truck is: " + loadCap + " tons");
        System.out.println("Towing Capacity of truck is: " + towCap + " pounds");

    }

}
