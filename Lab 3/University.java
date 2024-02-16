class University {
    private String uniName;
    private String location;
    private String rectorName;
    private String departments[] = new String[20];
    public void setUniName(String uni){
        uniName = uni;
    }
    public void setLoc(String loc){
        location = loc;
    }
    public void setRec(String rec){
        rectorName = rec;
    }
    public void setDept(String [] dept){
        for(int i = 0; i<dept.length; i++){
            departments[i]=dept[i];
        }
    }
    public String getUniName(){
        return uniName;
    }
    public String getLoc(){
        return location;
    }
    public String getRec(){
        return rectorName;
    }
    public String [] getDept(){
        return departments;
    }

    public void setData(String a, String b, String c, String[] d){
        uniName = a;
        location = b;
        rectorName = c;
        for (int i = 0; i < d.length; i++) {
            if (i < 20) { 
                departments[i] = d[i];
            } else {
                System.out.println("can't register the department.");
            }
        }

    }

    public University() {

    }

    public University(String a, String b) {
        uniName = a;
        rectorName = b;
    }

    public University(String a, String b, String c, String[] d) {
        uniName = a;
        location = b;
        rectorName = c;
        for (int i = 0; i < d.length; i++) {
            if (i < 20) { 
                departments[i] = d[i];
            } else {
                System.out.println("can't register the department.");
            }
        }
    }
     public University(University u1) {
        uniName = u1.uniName;
        location = u1.location;
        rectorName = u1.rectorName;
        for (int i = 0; i < departments.length; i++) {
            if (i < 20) { 
                departments[i] = u1.departments[i];
            } else {
                System.out.println("can't register the department.");
            }
        }
    }
    public boolean equal(University u1){
        if(!this.location.equalsIgnoreCase(u1.location)){
            return false;
        }
        if(!this.uniName.equalsIgnoreCase(u1.uniName)){
            return false;
        }
        if(!this.rectorName.equalsIgnoreCase(u1.rectorName)){
            return false;
        }
        for(int i = 0; i<departments.length; i++){
            if(!this.departments[i].equalsIgnoreCase(u1.departments[i])){
            return false;
        }

        }
        return true;
        
    }

    public void display() {
        System.out.println("Name of the university is: " + uniName);
        System.out.println("It's location is in: " + location);
        System.out.println("It's rector is (Mr/Ms): " + rectorName);
        System.out.println("Its department's are: ");
        for (int i = 0; i < departments.length; i++) {
            if (departments[i] != null) { 
                System.out.println(departments[i]);
            }
        }
    }

    public void addADepartment(String a) {
        boolean added = false; 
        for (int i = 0; i < departments.length; i++) {
            if (departments[i] == null) {
                departments[i] = a;
                added = true; 
                break;
            }
        }
        if (!added) { 
            System.out.println("can't register the department.");
        }
    }

    public boolean check() {
        if (location.equals("Lahore") || location.equals("Karachi") || location.equals("Peshawar")
                || location.equals("Quetta") || location.equals("Islamabad")) {
            return true;
        } else
            return false;
    }

    public boolean search(String a) {
        boolean flag = false;
        for (int i = 0; i < departments.length; i++) {
            if (departments[i] != null) { 
                if (departments[i].equals(a)) {
                    flag = true;
                    break; 
                }
            }
        }
        return flag;
    }

    public University compDept(University u1){
        for(int i = 0; i<departments.length; i++){
            if(departments[i]==null){
                if(this.departments.length>u1.departments.length){
                    return this;
                }
            }
        }
        return u1;
    }

}
