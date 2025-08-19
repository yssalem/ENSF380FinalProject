package edu.ucalgary.oop;

import java.sql.*;

public class DatabaseAccess {
    private static Connection dbConnect;
    private static ResultSet results;

    public void createConnection(){
                
        try{
            dbConnect = DriverManager.getConnection("jdbc:postgresql://localhost/vet_clinic", "oop", "ucalgary");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            results.close();
            dbConnect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        DatabaseAccess myDB = new DatabaseAccess();
        myDB.createConnection();

        StringBuffer pets = new StringBuffer();

        try {
            Statement myStmt = dbConnect.createStatement();
            results = myStmt.executeQuery("SELECT * FROM pets");

            while (results.next()){
                System.out.println("Print results: " + results.getString("name") + ", " + results.getString("species"));

                pets.append(results.getString("name") + ", " + results.getString("species"));
                pets.append('\n');
            }

            myStmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(pets.toString());

        myDB.close();
    }
}