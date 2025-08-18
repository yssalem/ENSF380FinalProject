package edu.ucalgary.oop;

public class Cat extends Pet {
    private boolean isInside;

    public Cat(String name, int age, boolean isInside, Owner owner) {
        setName(name);
        setAge(age);
        setIsInside(isInside);
        setOwner(owner);
    }

    public boolean getIsInside() {
        return isInside;
    }

    public void setIsInside(boolean isInside) {
        this.isInside = isInside;
    }
    
}
