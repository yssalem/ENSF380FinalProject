package edu.ucalgary.oop;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) throws InvalidInputException{
        System.out.println("Select from menu options");
        System.out.println("1: Add Data");
        System.out.println("2: View Data");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        try{
            choice = scanner.nextInt();
            if(choice < 1 || choice > 2){
                throw new InvalidInputException("Invalid input. Please enter an integer from 1 to 2");
            }
        }
        catch(InvalidInputException e){
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter an integer from 1 to 2");
            scanner.nextLine();
        }
        finally{
            scanner.close();
        }
        switch(choice){
            case 1:
            System.out.println("Choose which data to add");
            System.out.println("1: new cat");
            System.out.println("2: new dog");
            System.out.println("3: new owner");
            System.out.println("4: new receptionist");
            System.out.println("5: new veterinarian");
            System.out.println("6: new appointment");
            break;
            case 2:
            System.out.println("Choose which data to view");
            break;
        }
    }

}
