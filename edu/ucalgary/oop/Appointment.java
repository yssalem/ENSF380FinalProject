package edu.ucalgary.oop;

import java.time.LocalDateTime;

public class Appointment {

    private LocalDateTime date;
    private Veterinarian vet;
    private Pet pet;
    private String notes;

    public Appointment(LocalDateTime date, Veterinarian vet, Pet pet, String notes){
        this.date = date;
        this.vet = vet;
        this.pet = pet;
        this.notes = notes;
    }

    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public Veterinarian getVet() {
        return vet;
    }
    public void setVet(Veterinarian vet) {
        this.vet = vet;
    }
    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

}
