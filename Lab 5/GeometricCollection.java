public class GeometricCollection {
    private Circle c_array[] = new Circle[10];
    private Rectangle r_array[] = new Rectangle[10];

    public GeometricCollection() {
        for (int i = 0; i < c_array.length; i++) {
            c_array[i] = new Circle(1);
        }

        for (int i = 0; i < r_array.length; i++) {
            r_array[i] = new Rectangle(1, 1);
        }
    }

    public GeometricCollection(Circle[] c) {
        if (c_array.length > c.length) {
            for (int i = 0; i < c.length; i++) {
                c_array[i] = c[i];
            }
        } else {
            for (int i = 0; i < c_array.length; i++) {
                c_array[i] = c[i];
            }
        }
    }

    public GeometricCollection(Circle[] c, Rectangle[] r) {
        if (r_array.length > r.length) {
            for (int i = 0; i < r.length; i++) {
                r_array[i] = r[i];
            }
        } else {
            for (int i = 0; i < r_array.length; i++) {
                r_array[i] = r[i];
            }
        }

        if (c_array.length > c.length) {
            for (int i = 0; i < c.length; i++) {
                c_array[i] = c[i];
            }
        } else {
            for (int i = 0; i < c_array.length; i++) {
                c_array[i] = c[i];
            }
        }
    }

    public void setCircleArray(Circle[] c) {
        if (c_array.length > c.length) {
            for (int i = 0; i < c.length; i++) {
                c_array[i] = c[i];
            }
        } else {
            for (int i = 0; i < c_array.length; i++) {
                c_array[i] = c[i];
            }
        }
    }

    public void setRectangleArray(Rectangle[] r) {
        if (r_array.length > r.length) {
            for (int i = 0; i < r.length; i++) {
                r_array[i] = r[i];
            }
        } else {
            for (int i = 0; i < r_array.length; i++) {
                r_array[i] = r[i];
            }
        }
    }

    public Circle[] getCircleArray() {
        return c_array;
    }

    public Rectangle[] getRectangleArray() {
        return r_array;
    }

    public void display() {
        System.out.println("Circles:");
        for (int i = 0; i < c_array.length; i++) {
            System.out.println("Radius: " + c_array[i].getRadius());
        }
        System.out.println();

        // System.out.println("Rectangles:");
        // for (int i = 0; i < r_array.length; i++) {
        // System.out.println("Length: " + r_array[i].getLen() + ", Width: " +
        // r_array[i].getWid());
        // }
        System.out.println();
    }

    public double totalArea() {
        double totArea = 0;
        for (int i = 0; i < c_array.length; i++) {
            totArea += c_array[i].area();
        }

        return totArea;
    }

    public void display1() {
        System.out.println("Circles:");
        
            for (int i = 0; i < c_array.length; i++) {
                if (c_array[i].getRadius() > 50.0) {
                System.out.println("Radius: " + c_array[i].getRadius());
            }

        }

    }

}
