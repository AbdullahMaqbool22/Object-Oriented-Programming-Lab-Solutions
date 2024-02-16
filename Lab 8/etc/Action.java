public class Action extends Movie {
    private int daysRented;

    public Action() {
        super();
        daysRented = 0;
    }

    public Action(int i, String t, int d, int dR) {
        super(i, t, d);
        daysRented = dR;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public void setDaysRented(int daysRented) {
        this.daysRented = daysRented;
    }

    public double calcLate() {
        double fee = 15;
        if (daysRented > days) {
            fee += (daysRented - days) * 3;
        } 
        return fee;
    }
}
