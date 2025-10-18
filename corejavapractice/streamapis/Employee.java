package corejavapractice.streamapis;

public class Employee {
    private String name;
    private String location; 

    public Employee(String name, String location){
        this.name=name;
        this.location=location;
    }
    public String getName(){
        return this.name;
    }
    public String getLocation(){
        return this.location;
    }
}
