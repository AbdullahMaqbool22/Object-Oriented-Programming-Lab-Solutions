public abstract class Movie {
    protected int ID;
    protected String title;
    protected int days;

    public Movie() {
        ID = 0;
        this.title = "abc";
        this.days = 0;
    }
    
    public Movie(int i, String t, int d) {
        ID = i;
        this.title = t;
        this.days = d;
    }

    public int getID() {
        return ID;
    }
    
    public void setID(int i) {
        ID = i;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String t) {
        this.title = t;
    }
    
    public int getDays() {
        return days;
    }
    
    public void setDays(int d) {
        this.days = d;
    }

    public boolean equals(Movie m) {
        boolean flag = false;
        if (this.ID == m.getID()) {
            if (this.title == m.getTitle()) {
                if (this.days == m.getDays()) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public abstract double calcLate();
    
}
