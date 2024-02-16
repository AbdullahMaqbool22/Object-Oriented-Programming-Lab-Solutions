public class Person {
    protected String name;
    protected int age;
    
    public Person(){
        this.name = null;
        this.age = 0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void display() {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }

}