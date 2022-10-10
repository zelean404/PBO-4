package Lat_inheritance;

public class Employee extends Person{
    private String department, title;
    
    //constructor berparamter dari super dan sub class
    public Employee(String id, String name, String address, String department, String title){
        super(id, name, address);
        this.department = "IT";
        this.title = title;
    }
    
    //getter
    public String getDepartment() {
        return department;
    }
    public String getTitle() {
        return title;
    }
    
    //custom method
    public void getData(){
        System.out.println(super.getId()+" "+super.getName()+" "+super.getAddress()+" "+getDepartment()+" "+getTitle());
    }
}
