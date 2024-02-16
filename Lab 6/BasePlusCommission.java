class BasePlusCommission extends CommissionEmployee {
    protected int salary;

    public BasePlusCommission() {
        salary = 0;
    }

    public BasePlusCommission(int salary) {
        this.salary = salary;
    }

    public BasePlusCommission(String firstName, String lastName, int sSN, int commissionRate, int grossSales,
            int salary) {
        super(firstName, lastName, sSN, commissionRate, grossSales);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return super.toString() + salary;
    }
    public int calcEarn(){
        int a = super.calcEarn();
        return a + salary;
    }
}
