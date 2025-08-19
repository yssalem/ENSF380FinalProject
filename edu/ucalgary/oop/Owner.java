package edu.ucalgary.oop;

import java.util.*;

public class Owner {
    private String name;
    private String email;
    private String phoneNumber;
    private ArrayList<Pet> pets;
    private static int ownerCount = 0;

    public Owner(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        ownerCount++;
    }

    public Owner() {
        ownerCount++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static int getOwnerCount() {
        return ownerCount;
    }

    public void addDog(String name, int age, boolean isVaccinated) {
        pets.add(new Dog(name, age, isVaccinated, this));
    }

    public void addCat(String name, int age, boolean isInside) {
        pets.add(new Cat(name, age, isInside, this));
    }

    public void displayPets() {
        pets.forEach( n -> System.out.println((pets.indexOf(n) + 1) + ". " + n) );
    }

    public Pet getPet(int index) {
        return pets.get(index);
    }
}
