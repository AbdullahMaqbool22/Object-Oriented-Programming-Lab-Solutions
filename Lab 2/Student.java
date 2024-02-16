class Student {
    String name;
    String[] course = new String[5];
    String email;

    public void add(String a) {
        for (int i = 0; i < course.length; i++) {
            if (course[i] == null) {
                course[i] = a;
                break;
            }
        }
    }

    public void setData(String a, String b, String[] c) {
        name = a;
        email = b;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null) {
                c[i] = course[i];
            }
        }
    }

    public boolean valid(String a) {
        int x = a.indexOf('@');
        if (x >= 0 && x < 9) {
            String b = a.substring(x);
            return b.equals(a);
        } else {
            return false;
        }
    }

    public void showData(String a, String b, String[] c) {
        System.out.println("name is: " + a);
        System.out.println("email is: " + b);
        boolean flag = valid(b);
        if (flag == true) {
            System.out.println("Email valid.");
        } else {
            System.out.println("Email not valid.");
        }

        for (int i = 0; i < c.length; i++) {
            if (c[i] != null) {
                System.out.println("Course " + (i + 1) + ": " + c[i]);
            }
        }
    }
}