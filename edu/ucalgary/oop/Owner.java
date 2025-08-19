/**
@author 	Youssef Salem
*/

package edu.ucalgary.oop;

import java.util.*;

/**
Owner class stores information about the owner and a list of the pets the owner has.
*/
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

    /**
    This function adds a dog to the list of pets for the owner
    @param name, age, and vaccination status of the dog
    */
    public void addDog(String name, int age, boolean isVaccinated) {
        pets.add(new Dog(name, age, isVaccinated, this));
    }

    /**
    This function adds a cat to the list of pets for the owner.
    @param name, age, and domain of the cat
    */
    public void addCat(String name, int age, boolean isInside) {
        pets.add(new Cat(name, age, isInside, this));
    }

    /**
    This function displays all the pets owned by the owner.
    */
    public void displayPets() {
        pets.forEach( n -> System.out.println((pets.indexOf(n) + 1) + ". " + n) );
    }

    /**
    This function returns the pet object of an owner's pet.
    @param index of the pet in ArrayList pets
    */
    public Pet getPet(int index) {
        return pets.get(index);
    }
}
