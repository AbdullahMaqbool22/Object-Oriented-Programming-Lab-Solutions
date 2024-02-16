package task6;

class Staff extends Employee {
    protected String title;

    public Staff() {
        title = null;
    }

    public Staff(String title) {
        this.title = title;
    }

    public Staff(String office, int salary, Date hiredDate, String title) {
        super(office, salary, hiredDate);
        this.title = title;
    }

    public Staff(String name, String address, int phoneNo, String email, String office, int salary, Date hiredDate,
            String title) {
        super(name, address, phoneNo, email, office, salary, hiredDate);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return super.toString() + " title=" + title + "]";
    }

    public void Display() {
        super.Display();
        System.out.println("Title of staff is: " + title);
    }

}
