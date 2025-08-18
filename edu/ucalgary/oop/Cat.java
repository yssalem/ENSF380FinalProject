package edu.ucalgary.oop;

public class Cat extends Pet {
    private boolean isInside;

    public Cat(String name, int age, boolean isInside) {
        setName(name);
        setAge(age);
        setIsInside(isInside);
    }

    public boolean getIsInside() {
        return isInside;
    }

    public void setIsInside(boolean isInside) {
        this.isInside = isInside;
    }
    
}
