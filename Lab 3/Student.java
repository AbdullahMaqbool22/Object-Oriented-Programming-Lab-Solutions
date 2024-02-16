class Student {
    private String name;
    private double gpa;
    private String subj[] = new String[5];
    private int marks[] = new int[5];
    private String email;

    public void setName(String na){
        name = na;
    }
    public void setGPA(double gp){
        gpa = gp;
    }
    public void setSubj(String [] sub){
        for(int i = 0; i<sub.length; i++){
            subj[i] = sub[i];
        }
    }
    public void setMark(int [] mark){
        for(int i = 0; i<mark.length; i++){
            marks[i] = mark[i];
        }
    }
    public void setEmail(String ema){
        email = ema;
    }
    public String getName(){
        return name;
    }
    public double getGPA(){
        return gpa;
    }
    public String [] getSubj(){
        return subj;
    }
    public int [] getMark(){
        return marks;
    }
    public String getEmail(){
        return email;
    }

    public Student() {

    }

    public Student(String a, double b, String[] c, String d) {
        name = a;
        gpa = b;
        for (int i = 0; i < c.length; i++) {
            subj[i] = c[i];
        }
        email = d;
    }
    private boolean verifyArrayLength(int [] a){
        int b = a.length;
        for(int i = 0; i<a.length; i++){
            if(a[i]<b){
                return true;
            } 
        }
         return false;
    } 
    public void setLength(int [] a){
        for(int i =0; i<a.length; i++){
            marks[i] = a[i];
        }

    } 
    public boolean getlength(){
        return verifyArrayLength(marks);
    }

    public void display() {
        System.out.println("name of student is: " + name);
        System.out.println("gpa is: " + gpa);
        System.out.println("subjects registered for: ");
        for (int i = 0; i < subj.length; i++) {
            System.out.println(subj[i]);
        }
         for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("student email is: " + email);

    }
    public Student(Student s1){
        name = s1.name;
        gpa = s1.gpa;
        for(int i = 0; i<subj.length; i++){
            subj[i] = s1.subj[i];
        }
        for(int i = 0; i<marks.length; i++){
            marks[i] = s1.marks[i];
        }
        email = s1.email;
    }
    public boolean equal(Student s1){
        if(!this.name.equals(s1.name)){
            return false;
        }
        if(this.gpa != s1.gpa){
            return false;
        }
        if(!this.email.equals(s1.email)){
            return false;
        }
        if(!this.subj.equals(s1.subj)){
            return false;
        }
        if(!this.marks.equals(s1.marks)){
            return false;
        }
        return true;
    }

    public boolean search(String a) {
        boolean flag = false;
        for (int i = 0; i < subj.length; i++) {
            if (subj[i].equals(a)) {
                flag = true;
            }

        }
        return flag;
    }

    public void setValues(String a, double b, String[] c, String d) {
        name = a;
        gpa = b;
        for (int i = 0; i < c.length; i++) {
            subj[i] = c[i];
        }
        email = d;
    }

    public boolean check() {
        if (gpa > 2.00) {
            return true;
        } else {
            return false;
        }
    }

    public boolean valid() {
        String c = "@";
        if (email.contains(c)) {
            return true;
        } else {
            return false;
        }

    }

    public int average(int [] a){
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            b += a[i];
        }
        int c = b / a.length;
        return c;
    }

    public Student compareAvg(Student s1){
        if(this.average(marks)>s1.average(marks)){
            return this;
        }
        else{
            return s1;
        }
    }


}
