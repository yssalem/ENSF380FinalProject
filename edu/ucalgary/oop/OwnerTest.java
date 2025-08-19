package edu.ucalgary.oop;

import org.junit.*;
import static org.junit.Assert.*;

public class OwnerTest {
    
    @Test
    public void testOwnerConstructor() {
        Owner expResultObject = new Owner();
        expResultObject.setName("John Doe");
        expResultObject.setEmail("john.doe@email.com");
        expResultObject.setPhoneNumber("555-5555");
        String[] expResult = {expResultObject.getName(), expResultObject.getEmail(), expResultObject.getPhoneNumber()};

        Owner resultObject = new Owner("John Doe", "john.doe@email.com", "555-5555");
        String[] result = {resultObject.getName(), resultObject.getEmail(), resultObject.getPhoneNumber()};

        
        
        assertEquals("Constructor produced different values: ", expResult, result);
        
        
    }


}
