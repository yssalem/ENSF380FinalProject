package edu.ucalgary.oop;

import java.sql.*;

public interface DatabaseAccess {  

    public void createConnection();
    public void close();

}