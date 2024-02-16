class Vehicle {
    protected String nameMan;
    protected int NoOfCyl;
    protected Person p1;

    public Vehicle() {
        nameMan = null;
        NoOfCyl = 0;
        p1 = new Person(null, 0);
    }

    public Vehicle(String nameMan, int noOfCyl) {
        this.nameMan = nameMan;
        NoOfCyl = noOfCyl;
    }

    public Vehicle(Person p1, String nameMan, int noOfCyl) {
        this.p1 = p1;
        this.nameMan = nameMan;
        NoOfCyl = noOfCyl;
    }

    public String getNameMan() {
        return nameMan;
    }

    public void setNameMan(String nameMan) {
        this.nameMan = nameMan;
    }

    public int getNoOfCyl() {
        return NoOfCyl;
    }

    public void setNoOfCyl(int noOfCyl) {
        NoOfCyl = noOfCyl;
    }

    public String toString() {
        return p1.toString() + "nameMan=" + nameMan + ", NoOfCyl=" + NoOfCyl + "]";
    }

    public void Display() {
        p1.Display();
        System.out.println("Name of manufacturer of truck is: " + nameMan);
        System.out.println("Number of Cylinder in truck is: " + NoOfCyl);
    }

}