class Job {
    private String Designation;
    private int Salary;
    private int Id;
    public Job(){

    }
    public Job(String designation, int salary, int id) {
        Designation = designation;
        Salary = salary;
        Id = id;
    }
    public Job(Job j1){
        this.Designation = j1.Designation;
        this.Salary = j1.Salary;
        this.Id = j1.Id;
    }
    public String getDesignation() {
        return Designation;
    }
    public void setDesignation(String designation) {
        Designation = designation;
    }
    public int getSalary() {
        return Salary;
    }
    public void setSalary(int salary) {
        Salary = salary;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }

    
}
