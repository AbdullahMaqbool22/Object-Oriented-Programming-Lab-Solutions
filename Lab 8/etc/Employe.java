public abstract class Employe {
    protected String firstN;
    protected String lastN;
    protected String ssn;

    public Employe() {
        this.firstN = "abc";
        this.lastN = "xyz";
        this.ssn = "01234";
    }

    public Employe(String fN, String lN, String s) {
        this.firstN = fN;
        this.lastN = lN;
        this.ssn = s;
    }

    public String getFirstN() {
        return firstN;
    }
    public void setFirstN(String fN) {
        this.firstN = fN;
    }
    public String getLastN() {
        return lastN;
    }
    public void setLastN(String lN) {
        this.lastN = lN;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String s) {
        this.ssn = s;
    }

    public abstract double earnings();
    
}