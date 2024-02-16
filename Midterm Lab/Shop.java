class Shop {
    private String owner;
    private Item[] item = new Item[100];
    private Customer[] c = new Customer[100];

    public Shop() {
        this.owner = null;
        for (int i = 0; i < item.length; i++) {
            new Item(null, null, 0.0);
        }
        for (int i = 0; i < c.length; i++) {
            new Customer(null, null);
        }
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }

    public Customer[] getC() {
        return c;
    }

    public void setC(Customer[] c) {
        this.c = c;
    }

    public Shop(String a) {
        this.owner = a;
    }

    public void AddItem(Item items) {
        for (int i = 0; i < item.length; i++) {
            if (item != null) {
                item[i] = items;
                break;
            }

        }

    }

    public void AddCustomer(Customer c1) {
        for (int i = 0; i < c.length; i++) {
            if (c != null) {
                c[i] = c1;
                break;
            }
        }
    }

    public double buy(Item items) {
        double d = 0.0;
        for (int i = 0; i < item.length; i++) {
            if (items.equals(item[i])) {
                d += items.getPrice();
                item[i] = new Item();
            }
        }
        return d;
    }

    public boolean findCustomer(Customer c2) {
        boolean flag = false;
        for (int i = 0; i < c.length; i++) {
            if (c2.getCustID() == c[i].getCustID()) {
                flag = true;
            }
        }
        return flag;
    }

}
