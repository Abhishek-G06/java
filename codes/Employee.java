package codes;
class Employee implements java.io.Serializable{
    private String department;
    private int id;
    public Employee(){}
    
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return(id);
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return(department);
    }
}