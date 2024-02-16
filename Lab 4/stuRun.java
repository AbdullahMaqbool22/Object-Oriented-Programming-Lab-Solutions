public class stuRun {
  public static void main(String[] args) {

    int a[] = { 10, 20, 30, 40, 50 };
    int b[] = { 10, 20, 50, 40, 50 };
    int c[] = { 10, 10, 30, 40, 50 };

    Student s4[] = new Student[3];
    s4[0] = new Student("Ali", a);
    s4[1] = new Student("Adi", b);
    s4[2] = new Student("Faiq", c);
    String res[] = Student.findFail(s4);
    for (int i = 0; i < res.length; i++) {
      System.out.println(res[i] + " ");
    }

  }

}
