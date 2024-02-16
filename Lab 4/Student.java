class Student {
    String name;
    int res_arr[] = new int[5];

    public Student() {

    }

    public Student(String a) {
        this.name = a;
    }

    public Student(String a, int[] b) {
        this.name = a;
        for (int i = 0; i < b.length; i++) {
            this.res_arr[i] = b[i];
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getRes_arr() {
        return res_arr;
    }

    public void setRes_arr(int[] res_arr) {
        this.res_arr = res_arr;
    }

    public int average() {
        int b = 0;
        for (int i = 0; i < res_arr.length; i++) {
            b += res_arr[i];
        }
        int c = b / res_arr.length;
        return c;
    }

    public Student compareAvg(Student s1) {
        if (this.average() > s1.average()) {
            return this;
        } else {
            return s1;
        }
    }

    public static String [] findFail(Student [] b){
        String k [] = new String[5];
        for(int i = 0; i<k.length; i++){
            k[i] = " ";
        }
        for(int i = 0; i<b.length; i++){
            if(b[i].average()<50){
                k[i] = b[i].getName();
            }
        }
        return k;
    }
}
