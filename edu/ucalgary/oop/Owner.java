package edu.ucalgary.oop;

import java.util.*;

public class Owner {
    private String name;
    private String email;
    private String phoneNumber;
    private ArrayList<Pet> pets;
    private static int ownerCount = 0;

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
}
