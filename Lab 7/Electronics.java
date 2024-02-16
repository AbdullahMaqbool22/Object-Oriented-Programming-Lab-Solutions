public class Electronics {
    private int laptop;
    private int mobile;
    private int camera;

    public Electronics() {
        this.laptop = 0;
        this.mobile = 0;
        this.camera = 0;

    }

    public Electronics(int laptop, int mobile, int camera) {
        this.laptop = laptop;
        this.mobile = mobile;
        this.camera = camera;
    }

    public int getLaptop() {
        return laptop;
    }

    public void setLaptop(int laptop) {
        this.laptop = laptop;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public void display() {
        System.out.println("Laptop quantity's are: " + laptop);
        System.out.println("Camera quantity's are: " + camera);
        System.out.println("Mobile quantity's are: " + mobile);
    }

}
