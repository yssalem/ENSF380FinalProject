package edu.ucalgary.oop;

public abstract class Employee {
    private String name;
    private int staffId;
    public Employee(int userStaffId, String userName){
        this.name = userName;
        this.staffId = userStaffId;
    }
    public void setName(String userName){
        this.name = userName;
    }
    public String getName(){
        return this.name;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    public int getStaffId(){
        return this.staffId;
    }
}
