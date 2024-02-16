class Cart {
    private Electronics e1;
    
    public int shop(String name, int quantity) {
        int a = 0;
        if (name.equalsIgnoreCase("Camera")) {
            if (quantity > e1.getCamera()) {
                a = e1.getCamera() - quantity;
            } else {
                System.out.println("Amount not available!");
            }
        }
        if (name.equalsIgnoreCase("Laptop")) {
            if (quantity > e1.getLaptop()) {
                a = e1.getLaptop() - quantity;
            } else {
                System.out.println("Amount not available!");
            }
        }
        if (name.equalsIgnoreCase("Mobile")) {
            if (quantity > e1.getMobile()) {
                a = e1.getMobile() - quantity;
            } else {
                System.out.println("Amount not available!");
            }
        }
        return a;
    }

    public int add(String name, int quantity) {
        int a = 0;
        if (name.equalsIgnoreCase("Camera")) {
            if (quantity > e1.getCamera()) {
                a = e1.getCamera() + quantity;
            } else {
                System.out.println("Amount not available!");
            }
        }
        if (name.equalsIgnoreCase("Laptop")) {
            if (quantity > e1.getLaptop()) {
                a = e1.getLaptop() + quantity;
            } else {
                System.out.println("Amount not available!");
            }
        }
        if (name.equalsIgnoreCase("Mobile")) {
            if (quantity > e1.getMobile()) {
                a = e1.getMobile() + quantity;
            } else {
                System.out.println("Amount not available!");
            }
        }
        return a;
    }

    
    
}
