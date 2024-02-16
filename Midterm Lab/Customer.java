class Customer extends Person {
    private String custID;
    private String pswd;

    public Customer() {
        this.custID = null;
        this.pswd = null;
    }

    public Customer(String a, String b) {
        this.custID = a;
        this.pswd = b;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String toString() {
        return super.toString() + " Customer ID is: " + custID + " Password is: " + pswd;
    }

}
