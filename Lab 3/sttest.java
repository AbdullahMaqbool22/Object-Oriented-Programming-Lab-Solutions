public class sttest {
    public static void main(String[] args) {
        String subj[] = { "PF", "OOP", "DSA", "ICT", "TCP" };
        String suba[] = { "PF", "OOP", "DSA", "ICT", "DAA" };
        int mar[] = { 10, 24, 6, 8, 5 };
        int mart[] = { 10, 24, 6, 8, 3 };
        Student s3 = new Student();
        Student s1 = new Student();
        Student s2 = new Student("Anam", 3.57, suba, "abc@gmail.com");

        s1.setValues("Ali", 2.57, subj, "abc@gmail.com");
        s1.display();
        System.out.println("Which subject do you want to search: ");
        String ch = "OOP";
        System.out.println("Is it here: " + s1.search(ch));
        System.out.println("Is the student pass: " + s1.check());
        System.out.println("Is the email valid: " + s1.valid());
        System.out.println("Average is: " + s1.average(mar));
        System.out.println("Average is: " + s3.average(mar));
        String a = s1.getName();
        int b[] = s2.getMark();
        s3.setName(a);
        s3.setMark(b);
        s3.display();
        s1.setMark(mar);
        s2.setMark(mart);

        double jj = s1.getGPA();
        double kk = s2.getGPA();
        if(jj>kk){
            System.out.println("Student 1 got higher marks.");
        }
        else{
            System.out.println("Student 2 got higher marks.");
        }
        boolean ll = checkT(s1.getSubj(), s2.getSubj());
       System.out.println("There are students studying same subjects: " + ll);
       
       System.out.println("The good average of a student is: ");
       Student e = s1.compareAvg(s2);
       e.display();

       Student s6 = new Student(s1);
       s6.display();
       System.out.println("Is it same: ");
       boolean l1 = s1.equal(s1);
       System.out.println(l1);

    }
    public static boolean checkT(String [] a, String [] b){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<b.length; j++){
                if(a[i].equalsIgnoreCase(b[j])){
                    return true;
                
                }
            }
        }
        return false;
    }

}
