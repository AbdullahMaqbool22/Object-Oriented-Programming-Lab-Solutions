class Publication {
    protected String title;
    protected int price;

    public Publication() {
        title = null;
        price = 0;
    }

    public Publication(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void Display() {
        System.out.println("Title is: " + title);
        System.out.println("Price is: " + price);
    }

    public String toString() {
        return "Publication [title=" + title + ", price=" + price + "]";
    }

}
