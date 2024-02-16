public class untest {
    public static void main(String[] args) {
        String dept [] = { "CS", "EEE", "EE", "BCT", "BBA" };
        String deptT [] = { "CS", "EEE", "EE", "BCT", "BBA", "GK", "BDA", "BKA"};
        University u1 = new University("NUST", "Islamabad", "Qazi Adnan", dept);
        University u2 = new University("FAST", "Islamabad", "Sohail Khan", deptT);
        u1.addADepartment("BAF");
        u1.display();
        System.out.println("Is university in federal or provincial city: " + u1.check());
        System.out.println("Which department do you want to search: ");
        String kk = "BAF";
        System.out.println("Is it there: " + u1.search(kk));
        String [] arr = u1.getDept();
        String [] arrr = u2.getDept();
        checkT(arr, arrr);
        String loca = u1.getLoc();
        String locat = u2.getLoc();
        System.out.println("Are both uni's same locations: " + checkL(loca, locat));

        System.out.println("Uni having more number of department.");
        University u5 = u1.compDept(u2);
        u5.display(); 

        University u7 = new University(u1);
        u7.display();

        System.out.println("is it same: ");
        boolean kl = u1.equal(u2);
        System.out.println(kl); 

        
    }
    public static void checkT(String [] a, String [] b){
        if (a.length > b.length){
            System.out.println("NUST has more departments.");
        }
        else if (a.length < b.length){
            System.out.println("FAST has more departments.");
        }
        else{
            System.out.println("NUST and FAST have the same number of departments.");
        }
    }
    public static boolean checkL(String a, String  b){
        if (a.equalsIgnoreCase(b)){
            return true;
        }
        return false;
    }
    
}
