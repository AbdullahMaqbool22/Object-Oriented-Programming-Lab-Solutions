public class CommissionEmploye extends Employe {
    private double sales;
    private double rate;

    public CommissionEmploye() {
        this.sales = 0;
        this.rate = 0;
    }

    public CommissionEmploye(String fN, String lN, String s, double sa, double r) {
        super(fN, lN, s);
        this.sales = sa;
        this.rate = r;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double s) {
        this.sales = s;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double r) {
        this.rate = r;
    }

    public double earnings() {
        double salary = 30 * (sales * rate);
        return salary;
    }
 
}
