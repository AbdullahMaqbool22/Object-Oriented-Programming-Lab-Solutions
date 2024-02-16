

public class Membership {
    private int miles;

    public Membership(){
        this.miles = 0;
    }

    public Membership(int miles) {
        this.miles = miles;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public void display(){
        System.out.println("Miles of customer are: " + miles);
    }
    
    
}
