public class runner {
    public static void main(String[] args) {
        Shop s1 = new Shop("Abdullah");
        Customer c2 = new Customer("ABCD1234", "123456");
        Order o1 = new Order(s1, c2);
        Item i1 = new Item("ABH123", "Juicer", 5000.0);
        System.out.println("Order taken: " + o1.takeOrder(i1));
        System.out.println("Total Bill for the customer is: " + o1.getTotalBill(i1));
        System.out.println("Discount was applied: " + o1.applyDiscount(c2));
        System.out.println("Total Bill for the customer is: " + o1.getTotalBill());
    }

}
