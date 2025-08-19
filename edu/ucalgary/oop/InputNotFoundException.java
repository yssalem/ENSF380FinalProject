package edu.ucalgary.oop;
/**@author Noor */
public class InputNotFoundException extends Exception {
    /**This exception happens when the user tries to use an invalid input
    *@param message is the error message
    *@return message returns error message
    *@throws InputNotFoundException when an input is entered that does not exist within the database for a pet or appointment field
    */
    public InputNotFoundException(String message) {
        super(message);
    }
}