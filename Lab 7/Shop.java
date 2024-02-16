
public class Shop {
    private String shop_name;
    private Electronics e1;
    private Customer c1;
    private Cart c2;

    public Shop() {
        this.shop_name = null;
    }

    public Shop(String shop_name, Electronics e1) {
        this.shop_name = shop_name;
        this.e1 = e1;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public Electronics getE1() {
        return e1;
    }

    public void setE1(Electronics e1) {
        this.e1 = e1;
    }

    public void display() {
        System.out.println("Shop name: " + shop_name);
        e1.display();
    }

    

}
