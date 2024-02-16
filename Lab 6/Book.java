class Book extends Publication {
    protected int pageCount;

    public Book(){
        pageCount = 0;
    }
    public Book(int pageCount) {
        this.pageCount = pageCount;
    }

    public Book(String title, int price, int pageCount) {
        super(title, price);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String toString() {
        return super.toString() + " pageCount=" + pageCount + "]";
    }

    public void Display() {
        super.Display();
        System.out.println("Pages are: " + pageCount);
    }

}
