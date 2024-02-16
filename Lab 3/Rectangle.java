class Rectangle {
    private int length;
    private int width;

    public void setLength(int len) {
        if (len > 0) {
            length = len;
        }
    }

    public void setWidth(int wid) {
        if (wid > 0) {
            width = wid;
        }
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Rectangle() {

    }

    // Copy constructors
    public Rectangle(Rectangle r3) {
        length = r3.length;
        width = r3.width;
    }

    // Equal length
    public boolean length(Rectangle r3) {
        if (this.length == r3.length) {
            return true;
        }
        if (this.width == r3.width) {
            return true;
        }
        return false;
    }

    public Rectangle(int a, int b) {
        if (a > 0 && b > 0) {
            length = a;
            width = b;

        }

    }

    public void Display() {
        System.out.println("Length of the rectangle is: " + length);
        System.out.println("Width of rectangle is: " + width);
    }

    public void setValues(int a, int b) {
        if (a > 0 && b > 0) {
            length = a;
            width = b;

        }
    }

    public int calcArea() {
        int area = length * width;
        return area;
    }

    public boolean checkSquare() {
        if (length == width) {
            return true;
        } else
            return false;
    }

    public Rectangle compareArea(Rectangle r1) {
        if (this.calcArea() > r1.calcArea()) {
            return this;
        }
        return r1;
    }

}
