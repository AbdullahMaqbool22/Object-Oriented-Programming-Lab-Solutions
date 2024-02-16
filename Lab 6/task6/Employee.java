package task6;

class Employee extends Person {
    protected String office;
    protected int salary;
    Date hiredDate = new Date(12, 2, 2010);

    public Employee() {
        office = null;
        salary = 0;
    }

    public Employee(String office, int salary, Date hiredDate) {
        this.office = office;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }

    public Employee(String name, String address, int phoneNo, String email, String office, int salary, Date hiredDate) {
        super(name, address, phoneNo, email);
        this.office = office;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public String toString() {
        return super.toString() + " office=" + office + ", salary=" + salary + ", hiredDate=" + hiredDate + "]";
    }

    public void Display() {
        super.Display();
        System.out.println("Employee office is: " + office);
        System.out.println("Salary of employee is: " + salary);
        System.out.print("Hiring date of employee is: ");
        hiredDate.Display();
    }

}
