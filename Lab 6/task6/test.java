package task6;

public class test {
    public static void main(String[] args) {
        Date d1 = new Date(12, 2, 2010);
        FacultyMember f1 = new FacultyMember("John", "Islamabad", 54321, "abd@gmail.com", "Dean", 100000, d1, 8, "CEO");

        Staff s1 = new Staff("Ali", "karachi", 54321, "al@gmail.com", "HOD", 10000, d1, "TA");
        f1.Display();
        s1.Display();

    }

}
