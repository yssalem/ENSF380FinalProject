package edu.ucalgary.oop;

import java.util.ArrayList;

public class Veterinarian extends Employee{
    private String specialization;
    private ArrayList<Appointment> appointmentSchedule;
    public Veterinarian(int userStaffId, String userName, String userSpecialization){
        super(userStaffId, userName);
        this.specialization = userSpecialization;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
