package task6;

public class Person {
    protected String name;
    protected String address;
    protected int phoneNo;
    protected String email;

    public Person() {
        name = null;
        address = null;
        phoneNo = 0;
        email = null;
    }

    public Person(String name, String address, int phoneNo, String email) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Person [name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + ", email=" + email + "]";
    }

    public void Display(){
        System.out.println("Name is: " + name);
        System.out.println("Address is: " + address);
        System.out.println("Phone number is: " + phoneNo);
        System.out.println("Email Address is: " + email);
    }
    

}
