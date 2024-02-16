

class Airplane {
    private String airline_name;
    private int airline_number;

    public Airplane() {
        airline_name = null;
        airline_number = 0;
    }

    public Airplane(String airline_name, int airline_number) {
        this.airline_name = airline_name;
        this.airline_number = airline_number;
    }

    public String getAirline_name() {
        return airline_name;
    }

    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }

    public int getAirline_number() {
        return airline_number;
    }

    public void setAirline_number(int airline_number) {
        this.airline_number = airline_number;
    }

    public void display() {
        System.out.println("Airplane is of airline: " + airline_name);
        System.out.println("Airline number is: " + airline_number);
    }
}
