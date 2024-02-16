class Address {
    private int home;
    private int street;
    private String city;

    public Address() {

    }

    public Address(Address a1) {
        this.city = a1.city;
        this.home = a1.home;
        this.street = a1.street;
    }

    public Address(int home, int street, String city) {
        this.home = home;
        this.street = street;
        this.city = city;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public int getStreet() {
        return street;
    }

    public void setStreet(int street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
