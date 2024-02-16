public class BasePlusCommissionEmploye extends CommissionEmploye {
    private double baseSalary;

    public BasePlusCommissionEmploye() {
        super();
        this.baseSalary = 0;
    }

    public BasePlusCommissionEmploye(String fN, String lN, String s, double sa, double r, double b) {
        super(fN, lN, s, sa, r);
        this.baseSalary = b;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double b) {
        this.baseSalary = b;
    }

    public double earnings() {
        double salary = super.earnings() + baseSalary;
        return salary;
    }
    
}
