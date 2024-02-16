class Book {
    private String bookName;
    private String publisher;
    private Person p1;
    private Address a1;
    public Book(String bookName, String publisher, Person p1, Address a1) {
        this.bookName = bookName;
        this.publisher = publisher;
        this.p1 = p1;
        this.a1 = a1;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public Person getP1() {
        return p1;
    }
    public void setP1(Person p2) {
        p1 = new Person(p2);
    }
    public void Display(){
        System.out.println("Book name is: " + bookName);
        System.out.println("Publisher is: " + publisher);
        System.out.println("Author name is: " + p1.getfName() + " " + p1.getlName());
        System.out.println("Address of Author is: Home Number: " + a1.getHome() + " Street Number: " + a1.getStreet() + " City: " + a1.getCity());
    }
    public boolean check(Book b1){
        if(this.bookName == b1.bookName){
            if(this.publisher == b1.publisher){
                if(this.p1.getfName() == b1.p1.getfName()){
                    if(this.p1.getlName() == b1.p1.getlName()){
                        if(this.a1.getCity() == b1.a1.getCity()){
                            if(this.a1.getHome() == b1.a1.getHome()){
                                if(this.a1.getStreet() == b1.a1.getStreet()){
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    public boolean checkStreet(){
        if(this.a1.getStreet()<10){
            return true;
        }
        return false;
    }
}
