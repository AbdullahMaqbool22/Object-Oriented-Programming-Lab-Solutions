class CommissionEmployee {
    protected String firstName;
    protected String lastName;
    protected int SSN;
    protected int commissionRate;
    protected int grossSales;

    public CommissionEmployee() {
        firstName = null;
        lastName = null;
        SSN = 0;
        commissionRate = 0;
        grossSales = 0;
    }

    public CommissionEmployee(String firstName, String lastName, int sSN, int commissionRate, int grossSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        SSN = sSN;
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int sSN) {
        SSN = sSN;
    }

    public int getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    public String toString() {
        return "CommissionEmployee [firstName=" + firstName + ", lastName=" + lastName + ", SSN=" + SSN
                + ", commissionRate=" + commissionRate + ", grossSales=" + grossSales + "]";
    }

    public int calcEarn() {
        return commissionRate * grossSales;
    }

    public void Display() {
        System.out.println("First Name is: " + firstName);
        System.out.println("Last name is: " + lastName);
        System.out.println("SSN of employee is: " + SSN);
        System.out.println("Commission rate is: " + commissionRate);
        System.out.println("Gross rate is: " + grossSales);
    }

    public boolean equal(CommissionEmployee ce1) {
        boolean flag = false;
        if (this.firstName.equals(ce1.firstName)) {
            if (this.lastName.equals(ce1.lastName)) {
                if (this.SSN == ce1.SSN) {
                    if (this.commissionRate == ce1.commissionRate) {
                        if (this.grossSales == ce1.grossSales) {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

}
