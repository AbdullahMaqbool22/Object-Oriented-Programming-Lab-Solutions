class Bus {
    private int BusNo;
    private int[] seatsAv = new int[50];
    private String[] nameofRes = new String[50];
    private String ArrivalStation;
    private String DepartureStation;
    private double ticketRate;

    public Bus() {

    }

    public Bus(int a, String b, String c, double d) {
        this.BusNo = a;
        this.ArrivalStation = b;
        this.DepartureStation = c;
        this.ticketRate = d;
    }

    public Bus(Bus b1) {
        BusNo = b1.BusNo;
        ArrivalStation = b1.ArrivalStation;
        DepartureStation = b1.DepartureStation;
        ticketRate = b1.ticketRate;
        for (int i = 0; i < nameofRes.length; i++) {
            nameofRes[i] = b1.nameofRes[i];
        }
        for (int i = 0; i < seatsAv.length; i++) {
            seatsAv[i] = b1.seatsAv[i];
        }
    }

    public int getBusNo() {
        return BusNo;
    }

    public void setBusNo(int busNo) {
        BusNo = busNo;
    }

    public int[] getSeatsAv() {
        return seatsAv;
    }

    public void setSeatsAv(int[] seatsAv) {
        this.seatsAv = seatsAv;
    }

    public String[] getNameofRes() {
        return nameofRes;
    }

    public void setNameofRes(String[] nameofRes) {
        this.nameofRes = nameofRes;
    }

    public String getArrivalStation() {
        return ArrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        ArrivalStation = arrivalStation;
    }

    public String getDepartureStation() {
        return DepartureStation;
    }

    public void setDepartureStation(String departureStation) {
        DepartureStation = departureStation;
    }

    public double getTicketRate() {
        return ticketRate;
    }

    public void setTicketRate(double ticketRate) {
        this.ticketRate = ticketRate;
    }

    public void Reserve(String name) {
        for (int i = 0; i < seatsAv.length; i++) {
            if (seatsAv[i] == 1) {
                seatsAv[i] = 0;
                nameofRes[i] = name;
                System.out.println("Seat " + (i + 1) + " reserved for " + name);
                return;
            }
        }
        System.out.println("No available seats.");
    }

    public void showResSeat() {
        System.out.println("Reserved Seats:");
        for (int i = 0; i < seatsAv.length; i++) {
            if (seatsAv[i] == 0) {
                System.out.println("Seat " + (i + 1) + ": " + nameofRes[i]);
            }
        }
    }

    public void cancelReservation(String name) {
        for (int i = 0; i < seatsAv.length; i++) {
            if (name.equals(nameofRes[i])) {
                seatsAv[i] = 1;
                nameofRes[i] = null;
                System.out.println("Reservation cancelled for " + name);
                return;
            }
        }
        System.out.println("No reservation found for " + name);
    }

    public Bus compareBus(Bus b1, Bus b2) {
        int reservedSeatsBus1 = 0;
    int reservedSeatsBus2 = 0;

    for (int i = 0; i < b1.getSeatsAv().length; i++) {
        if (b1.getSeatsAv()[i] == 0) {
            reservedSeatsBus1++;
        }
    }

    for (int i = 0; i < b2.getSeatsAv().length; i++) {
        if (b2.getSeatsAv()[i] == 0) {
            reservedSeatsBus2++;
        }
    }

    if (reservedSeatsBus1 > reservedSeatsBus2) {
        return b1;
    } else if (reservedSeatsBus1 < reservedSeatsBus2) {
        return b2;
    } else {
        return null;
    }
    }

    public static int totSale(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                count++;
            }
        }
        return count;
    }

    public static String[] busIsl(String[] a) {
        String[] arr = new String[50];
        for (int i = 0; i < a.length; i++) {
            if (a[i].equalsIgnoreCase("islamabad")) {
                arr[i] = a[i];
            }
        }
        return arr;
    }
}
