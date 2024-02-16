public class Employee {
    String firstName;
    Date dB;
    Date dH;
    Job j1;

    public Employee() {
        firstName = "abc";
        dB = new Date(0, 0, 0);
        dH = new Date(0, 0, 0);
        j1 = new Job(firstName, 0, 0);
    }

    public Employee(String fN, Date b, Date h, Job g) {
        firstName = fN;
        dB = b;
        dH = h;
        j1 = g;
    }

    public Employee(Employee e) {
        this.firstName = e.firstName;
        this.dB = new Date(e.dB);
        this.dH = new Date(e.dH);
        this.j1 = new Job(e.j1);

    }

    public Date getdB() {
        return dB;
    }

    public Date getdH() {
        return dH;
    }

    public Job getJ1() {
        return j1;
    }

    public void setJ1(Job j) {
        j1 = new Job(j);
    }

    public void setdB(Date d) {
        dB = new Date(d);
    }

    public void setdH(Date d) {
        dH = new Date(d);
    }

    public boolean checkExperience(Date dP) {
        boolean flag = false;
        if ((dP.getYear()) - (dH.getYear()) > 5) {
            flag = true;
        }
        return flag;
    }

    public boolean checkSalary(Job j1) {
        boolean flag = false;
        if ((j1.getSalary()) > 50000) {
            flag = true;
        }
        return flag;
    }

    public void Display() {
        System.out.println("Id of employee is: " + j1.getId());
        System.out.println("First name of employee is: " + firstName);
        System.out.println(
                "Date of birth for employee is: " + dB.getDay() + " - " + dB.getMonth() + " - " + dB.getYear());
        System.out
                .println("Date of Hire for employee is: " + dB.getDay() + " - " + dB.getMonth() + " - " + dB.getYear());
        System.out.println("Designation is: " + j1.getDesignation());
        System.out.println("Salary is: " + j1.getSalary());
    }

    public boolean equals(Employee e) {
        boolean flag = false;
        if (this.firstName == e.firstName) {
            if (this.dB.getYear() == e.dB.getYear()) {
                if (this.dB.getMonth() == e.dB.getMonth()) {
                    if (this.dB.getDay() == e.dB.getDay()) {
                        if (this.dH.getYear() == e.dH.getYear()) {
                            if (this.dH.getMonth() == e.dH.getMonth()) {
                                if (this.dH.getDay() == e.dH.getDay()) {
                                    if (this.j1.getDesignation() == e.j1.getDesignation()) {
                                        if (this.j1.getId() == e.j1.getId()) {
                                            if (this.j1.getSalary() == e.j1.getSalary()) {
                                                flag = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

}
