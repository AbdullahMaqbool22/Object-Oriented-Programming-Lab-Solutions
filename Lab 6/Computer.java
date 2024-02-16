class Computer {
    protected int memorySize;
    protected int storageSize;

    public Computer() {
        memorySize = 0;
        storageSize = 0;
    }

    public Computer(int memorySize, int storageSize) {
        this.memorySize = memorySize;
        this.storageSize = storageSize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public String toString() {
        return "Computer [memorySize=" + memorySize + ", storageSize=" + storageSize + "]";
    }

    public void Display() {
        System.out.println("Memory Size is: " + memorySize);
        System.out.println("Storage size is: " + storageSize);
    }

    public boolean equal(Computer c1) {
        if (this.memorySize == c1.memorySize) {
            if (this.storageSize == c1.storageSize) {
                return true;
            }
        }
        return false;
    }
}