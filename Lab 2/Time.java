class Time {
    int hour;
    int min;
    int sec;

    public Time(){
        
    }

    public void showData() {
        System.out.println("The time is: ");
        System.out.println(hour + " : " + min + " : " + sec);
    }

    public void convertToSec() {
        sec = (hour * 3600) + (min * 60) + sec;
        System.out.println("The time in seconds is: " + sec);

    }

    public void showData(int x) {
        System.out.println("The at the point data is: " + x);
    }

    public void setData(int a, int b, int c) {
        hour = a;
        min = b;
        sec = c;
    }
}
