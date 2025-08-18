package edu.ucalgary.oop;

public class Dog extends Pet {
    private boolean isVaccinated;

    public Dog(String name, int age, boolean isVaccinated, Owner owner) {
        setName(name);
        setAge(age);
        setIsVaccinated(isVaccinated);
        setOwner(owner);
    }

    public void setIsVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public boolean getIsVaccinated() {
        return isVaccinated;
    }
}
