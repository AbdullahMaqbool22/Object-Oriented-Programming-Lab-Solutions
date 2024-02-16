package task6;

class Student extends Person {
    protected String Status;

    public Student() {
        Status = null;
    }

    public Student(String status) {
        Status = status;
    }

    public Student(String name, String address, int phoneNo, String email, String status) {
        super(name, address, phoneNo, email);
        Status = status;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String toString() {
        return super.toString() + " Status=" + Status + "]";
    }

    public void Display() {
        System.out.println("Student info is: ");
        super.Display();
        System.out.println("Student status is: " + Status);
    }

}
