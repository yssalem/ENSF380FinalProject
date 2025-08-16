package edu.ucalgary.oop;

public abstract class Pet {
    private String name;
    private int age;
    private Owner owner;
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

}
