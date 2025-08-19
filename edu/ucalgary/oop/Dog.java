/**
@author 	Youssef Salem
*/

package edu.ucalgary.oop;

/**
Dog class stores information about the dog and extends Pet class functionality.
*/
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
