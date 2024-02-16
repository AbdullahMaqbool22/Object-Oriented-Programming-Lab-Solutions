import java.io.Serializable;

class Person implements Serializable {
    protected int ID;
    protected String name;
    protected int age;

    public Person() {
        ID = 0;
        this.name = "abc";
        this.age = 0;

    }

    public Person(int iD, String name, int age) {
        ID = iD;
        this.name = name;
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person [ID = " + ID + "\n" + " Name = " + name + " \n" + "Age =" + age + "\n";
    }

}