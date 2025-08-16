package edu.ucalgary.oop;

public class Dog extends Pet {
    private boolean isVaccinated;

    public void setIsVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public boolean getIsVaccinated() {
        return isVaccinated;
    }
}
