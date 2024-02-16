public class Customer extends Person {
    private String status;
    private Membership m1;

    public Customer(String status, Membership m1) {
        this.status = status;
        this.m1 = m1;
    }

    public Customer(String name, int age, String status, Membership m1) {
        super(name, age);
        this.status = status;
        this.m1 = m1;
    }

    public Customer(String name, int age, String status) {
        super(name, age);
        this.status = status;
    }

    public Customer() {
        this.status = null;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Membership getM1() {
        return m1;
    }

    public void setM1(Membership m1) {
        this.m1 = m1;
    }

    
}
