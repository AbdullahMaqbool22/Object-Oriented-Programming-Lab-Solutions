class test2 {
    public static void main(String[] args) {
        Person p1 = new Person("Ahmad", "Hussien");
        Address a1 = new Address(6, 3, "Islamabad");
        Book b1 = new Book("Alibaba", "Gaba", p1, a1);
        b1.Display();
        System.out.println(b1.checkStreet());
    }
}
