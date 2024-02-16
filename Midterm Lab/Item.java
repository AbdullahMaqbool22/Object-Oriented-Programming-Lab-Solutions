class Item {
    private String id;
    private String name;
    private double price;

    public Item() {
        this.id = null;
        this.name = null;
        this.price = 0.0;
    }

    public Item(String a, String b, double c) {
        this.id = a;
        this.name = b;
        this.price = c;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Item id is: " + id + " Item name is: " + name + " Item price is: " + price;
    }

}
