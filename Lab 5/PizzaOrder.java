public class PizzaOrder {
    private Pizza p1; 
    private Pizza p2;
    private Pizza p3;

    public PizzaOrder() {
        this.p1 = new Pizza("Small", 0, 0, 0);
        this.p2 = new Pizza("Small", 0, 0, 0);
        this.p3 = new Pizza("Small", 0, 0, 0);
    }
 
    public PizzaOrder(Pizza p1) {
        this.p1 = p1;
        this.p2 = new Pizza("Small", 0, 0, 0);
        this.p3 = new Pizza("Small", 0, 0, 0);
    }

    public PizzaOrder(Pizza p1, Pizza p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = new Pizza("Small", 0, 0, 0);
    }

    public PizzaOrder(Pizza p1, Pizza p2, Pizza p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void setP1(Pizza p1) {
        this.p1 = p1;
    }
    
    public void setP2(Pizza p2) {
        this.p2 = p2;
    }
   
    public void setP3(Pizza p3) {
        this.p3 = p3;
    }

    public Pizza getP1() {
        return p1;
    }

    public Pizza getP2() {
        return p2;
    }

    public Pizza getP3() {
        return p3;
    }

    public double calcTotal() {
        double cost = 0;
        cost = p1.calCost() + p2.calCost() + p3.calCost();
        return cost;
    }   
}
