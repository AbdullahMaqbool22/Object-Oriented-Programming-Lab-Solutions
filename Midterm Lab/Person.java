class Person {
    protected String name;
    protected int age;

    public Person() {
        this.name = null;
        this.age = 0;
    }

    public Person(String a, int b) {
        this.name = a;
        this.age = b;
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
        return "Name is: " + name + " and Age is: " + age;
    }

}
