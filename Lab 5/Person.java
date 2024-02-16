class Person {
    private String fName;
    private String lName;
    private Address a1;

    public Person() {

    }
    public Person(Person p3){
        this.fName = p3.fName;
        this.lName = p3.lName;
        this.a1 = p3.a1;
    }

    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public void setfName(String Fname) {
        this.fName = Fname;
    }

    public void setlName(String Lname) {
        this.lName = Lname;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public void setAddress(Address a2) {
        a1 = new Address(a2);
    }

    public Address getAddress() {
        return a1;
    }

    public boolean checkIslamabad() {
        if (this.a1.getCity().equalsIgnoreCase("Islamabad")) {
            return true;
        }
        return false;
    }
}
