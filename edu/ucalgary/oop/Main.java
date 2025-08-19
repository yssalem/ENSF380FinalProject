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
        Scanner scanner2 = new Scanner(System.in);
        switch(choice){
            case 1:
            System.out.println("Choose which data to add");
            System.out.println("1: cat");
            System.out.println("2: dog");
            System.out.println("3: owner");
            System.out.println("4: receptionist");
            System.out.println("5: veterinarian");
            System.out.println("6: appointment");
            try{
            choice = scanner2.nextInt();
            if(choice < 1 || choice > 2){
                throw new InvalidInputException("Invalid input. Please enter an integer from 1 to 2");
            }
            }
            catch(InvalidInputException e){
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input. Please enter an integer from 1 to 2");
                scanner2.nextLine();
            }
            finally{
                scanner2.close();
            }
            break;
            case 2:
            System.out.println("Choose which data to view");
            break;
        }
    }
    public static void addCat(String name, int age, Owner owner, boolean isInside){
        Cat newCat = new Cat(name, age, isInside, owner);
    }
    public static void addDog(String name, int age, Owner owner, boolean isVaccinated){
        Dog newDog = new Dog(name, age, isVaccinated, owner);
    }
    public static void addOwner(String name, String email, String phoneNumber){
        Owner newOwner = new Owner(name, email, phoneNumber);
    }
    public static void addReceptionist(int staffId, String userName){
        Receptionist newReceptionist = new Receptionist(staffId,userName);
    }
    public static void addVeterinarian(int staffId, String userName, String userSpecialization){
        Receptionist newVeterinarian = new Veterinarian(staffId,userName, userSpecialization);
    }
}
