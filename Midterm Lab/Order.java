class Order {
    private Item[] items = new Item[30];
    private Customer c;
    private double totalBill;
    private Shop s;

    public Order(Shop s1, Customer c2) {
        this.c = c2;
        this.s = s1;
    }

    public double takeOrder(Item item) {
        double d = 0.0;
        for (int i = 0; i < items.length; i++) {
            if (item.getId().equals(items[i].getId())) {
                d = s.buy(item);
            }
        }
        return d;
    }

    public double applyDiscount(Customer c2) {
        if (this.c.getCustID().equals(c2.getCustID())) {
            totalBill = totalBill - (10 / 100);
        }
        return totalBill;
    }

    public double getTotalBill(Item i) {
        return totalBill + i.getPrice();
    }

    public double getTotalBill() {
        return totalBill;
    }

}
