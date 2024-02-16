class Tape extends Publication {
    protected int playingTime;

    public Tape(){
        playingTime = 0;
    }

    public Tape(int playingTime) {
        this.playingTime = playingTime;
    }

    public Tape(String title, int price, int playingTime) {
        super(title, price);
        this.playingTime = playingTime;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    public String toString() {
        return super.toString() + " playingTime=" + playingTime + "]";
    }

    public void Display() {
        super.Display();
        System.out.println("Playing Time of Tape is: " + playingTime);
    }

}
