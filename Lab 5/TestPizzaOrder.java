public class TestPizzaOrder {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Small", 2, 3, 0);
        Pizza p2 = new Pizza("Medium", 4, 0, 0);
        PizzaOrder p = new PizzaOrder(p1, p2);
        p1.getDescription();
        System.out.println("Price: " + p1.calCost());
        System.out.println(p1.getDescription());
        System.out.println();
        System.out.println("Price: " + p2.calCost());
        System.out.println(p2.getDescription());
        System.out.println();
        System.out.println("Total cost is: " + p.calcTotal());
    }
}
