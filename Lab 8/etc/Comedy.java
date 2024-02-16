public class Comedy extends Movie {
    private int daysRented;

    public Comedy() {
        super();
        daysRented = 0;
    }

    public Comedy(int i, String t, int d, int dR) {
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
        double fee = 12;
        if (daysRented > days) {
            fee += (daysRented - days) * 2.5;
        }
        return fee;
    }
    
}
