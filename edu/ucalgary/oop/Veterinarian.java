package edu.ucalgary.oop;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
    public boolean checkIfFree(LocalDateTime date){
        for(Appointment appointment : appointmentSchedule){
            if(appointment.getDate().equals(date)){
                return false;
            }
        }
        return true;
    }
    public int checkNumberAppointments(LocalDateTime date){
        int dateCount = 0;
        for(Appointment appointment : appointmentSchedule){
            if(appointment.getDate().toLocalDate().equals(date.toLocalDate())){
                dateCount++;
            }
        }
        return dateCount;
    }
}
