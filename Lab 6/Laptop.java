public class Laptop extends Computer {
    protected int length;
    protected int width;

    public Laptop() {
        length = 0;
        width = 0;
    }

    public Laptop(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Laptop(int memorySize, int storageSize, int length, int width) {
        super(memorySize, storageSize);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String toString() {
        return "Laptop [length=" + length + ", width=" + width + super.toString();
    }

}
