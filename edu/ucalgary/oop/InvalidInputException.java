package edu.ucalgary.oop;
/**@author Noor
 * 
 */
public class InvalidInputException extends Exception {
    /**This exception is for when the user selects an unavailable menu option
     * @param message is the error message
     * @return message is the error message to display
     * @throws InvalidInputException when the user has entered an invalid input in the menu options
     */
    public InvalidInputException(String message) {
        super(message);
    }

    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
    }
}
