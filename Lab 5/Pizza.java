public class Pizza {
    private String size;
    private int cheese;
    private int pepperoni;
    private int ham;
      
    public Pizza() {
        this.size = "Small";
        this.cheese = 0;
        this.pepperoni = 0;
        this.ham = 0;
    }

    public Pizza(String size, int cheese, int pepperoni, int ham) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.ham = ham;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public void setCheese(int cheese) {
        this.cheese = cheese;
    }
    
    public void setPepperoni(int pepperoni) {
        this.pepperoni = pepperoni;
    }
    
    public void setHam(int ham) {
        this.ham = ham;
    }

    public String getSize() {
        return size;
    }

    public int getCheese() {
        return cheese;
    }

    public int getPepperoni() {
        return pepperoni;
    }

    public int getHam() {
        return ham;
    }

    public double calCost() {
        double cost = 0;
        if(size == "Small") {
            cost = 500 + (5 * (cheese) + 5 * (pepperoni) + 5 * (ham));
        } else if (size == "Medium") {
            cost = 1500 + (5 * (cheese) + 5 * (pepperoni) + 5 * (ham));
        } else if (size == "Large") {
            cost = 2500 + (5 * (cheese) + 5 * (pepperoni) + 5 * (ham));
        } else {
            System.out.println("Invalid size!");
        }
        return cost;
    }

    public String getDescription() {
        String d = size + " Pizza with " + this.getCheese() + " Cheese, " + this.getPepperoni() + " Pepperoni, and " + this.getHam() + " Ham.";
        return d;
    }
    
}
