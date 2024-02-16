public class Drama extends Movie {

    private int daysRented;

    public Drama() {
        super();
        daysRented = 0;
    }

    public Drama(int i, String t, int d, int dR) {
        super(i, t, d);
        daysRented = dR;
    }

    public double calcLate() {
        double fee = 10;
        if (daysRented > days) {
            fee += (daysRented - days) * 2;
        } 
        return fee;

    }
}
