package task6;

class FacultyMember extends Employee {
    protected int officeHour;
    protected String rank;

    public FacultyMember() {
        officeHour = 0;
        rank = null;
    }

    public FacultyMember(int officeHour, String rank) {
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public FacultyMember(String office, int salary, Date hiredDate, int officeHour, String rank) {
        super(office, salary, hiredDate);
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public FacultyMember(String name, String address, int phoneNo, String email, String office, int salary,
            Date hiredDate,
            int officeHour, String rank) {
        super(name, address, phoneNo, email, office, salary, hiredDate);
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public int getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(int officeHour) {
        this.officeHour = officeHour;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString() {
        return super.toString() + " officeHour=" + officeHour + ", rank=" + rank + "]";
    }

    public void Display() {
        super.Display();
        System.out.println("Office hours of faculty member is: " + officeHour);
        System.out.println("Rank of faculty member is: " + rank);
    }

}
