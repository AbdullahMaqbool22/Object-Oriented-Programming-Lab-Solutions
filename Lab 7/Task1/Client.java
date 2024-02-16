class Client extends Person {
    private String status;
    private int miles;
    private Ticket t1;

    public Client() {
        this.status = null;
        this.miles = 0;
    }

    public Client(String status, int miles, Ticket t1) {
        this.status = status;
        this.miles = miles;
        this.t1 = t1;
    }

    public Client(String name, int age, String status, int miles, Ticket t1) {
        super(name, age);
        this.status = status;
        this.miles = miles;
        this.t1 = t1;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public Ticket getT1() {
        return t1;
    }

    public void setT1(Ticket t1) {
        this.t1 = t1;
    }

    public void display() {
        super.display();
        System.out.println("Status of client is: " + status);
        System.out.println("Miles of client is: " + miles);
        t1.display();
    }

    

}
