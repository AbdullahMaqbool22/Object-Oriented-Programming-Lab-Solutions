class Point {
    private int x, y;
    public void setX(int xt){
        x = xt;
    }
    public void setY(int yt){
        y = yt;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public Point(){

    }
    public Point(int a, int b){
        x = a;
        y = b;
    }
    public void display(){
        System.out.println("The value at point x is: " + x);
        System.out.println("The value at point y is: " + y);
    }
    public void setValues(int a, int b){
        x = a;
        y = b;
    }
    public void movePoint(int dx, int dy) {
        System.out.println("The point x moved: " + (x + dx));
        System.out.println("The point x moved: " + (y + dy));
    }
    public boolean checkOrigin(){
        if (x==0 && y ==0){
            return true;
        }
        else{
            return false;
        }

    }
    public Point(Point p1){
        x = p1.x;
        y = p1.y;
    }
    public boolean equal(Point p1){
        if(this.x == p1.x && this.y == p1.y){
            return true;
        }
        return false;
    }
    public Point addTwo(Point pa){
        int x = this.x + pa.x;
        int y = this.y + pa.y;
        Point p4 = new Point(x, y);
        return p4;
    }
    public Point addThree(Point pt, Point pk){
        int x = this.x + pt.x + pk.x;
        int y = this.y + pt.y + pk.y;
        Point p5 = new Point(x, y);
        return p5;

    }

    
}
