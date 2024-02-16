public class HourlyEmploye extends Employe {
    private int hours;
    private double wage;

    public HourlyEmploye() {
        super();
        this.hours = 0;
        this.wage = 0;
    }
    public HourlyEmploye(String fN, String lN, String s, int h, double w) {
        super(fN, lN, s);
        this.hours = h;
        this.wage = w;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int h) {
        this.hours = h;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double w) {
        this.wage = w;
    }

    public double earnings() {
        double salary = 30 * (hours * wage);
        return salary;
    }
    
}
