package edu.ucalgary.oop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
/**@author Noor 
* This class creates the vets which are used in appointment
*/
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
    /**This function checks if a vet is available at a certain time
    * @param date is the time to check
    * @return returns false if there is no time available
    */
    public boolean checkIfFree(LocalDateTime time){
        
        for(Appointment appointment : appointmentSchedule){
            if(appointment.getDate().equals(time)){
                return false;
            }
        }
        return true;
    }
    /**This function checks the number of appointments a vet has on a single day
    * @param date is the date to check
    * @return dateCount is the number of appointments on a single day
    */
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
