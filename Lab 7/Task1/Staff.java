

class Staff extends Person {
    private int grade;
    private int salary;
    private Airplane a1;

    public Staff() {
        this.grade = 0;
        this.salary = 0;

    }

    public Staff(int grade, int salary, Airplane a1) {
        this.grade = grade;
        this.salary = salary;
        this.a1 = a1;
    }

    public Staff(String name, int age, int grade, int salary, Airplane a1) {
        super(name, age);
        this.grade = grade;
        this.salary = salary;
        this.a1 = a1;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Airplane getA1() {
        return a1;
    }

    public void setA1(Airplane a1) {
        this.a1 = a1;
    }
    public void display(){
        super.display();
        System.out.println("Grade of the staff is: " + grade);
        System.out.println("Salary of staff is: " + salary);
        a1.display();
    }
}
