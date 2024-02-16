class Person {
    private String name;
    private int age;
    public Person(){
        name = null;
        age = 0;
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

    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    public void Display(){
        System.out.println("Name of owner of truck is: " + name);
        System.out.println("Age of owner of truck is: " +  age);
    }
}
