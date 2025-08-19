package edu.ucalgary.oop;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class Main {
    private static ArrayList<Cat> cats = new ArrayList<>();
    private static ArrayList<Dog> dogs = new ArrayList<>();
    private static ArrayList<Veterinarian> vets = new ArrayList<>();
    private static ArrayList<Owner> owners = new ArrayList<>();
    private static ArrayList<Receptionist> receptionists = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();
    public static void main(String[] args) throws InvalidInputException{
        System.out.println("Select from menu options");
        System.out.println("1: Add Data");
        System.out.println("2: View Data");
        Scanner scanner = new Scanner(System.in);
        int choice = getValidatedInt(scanner, 1, 2);
        switch(choice){
            case 1:
            showAddMenu(scanner);
            break;
            case 2:
            showViewMenu(scanner);
            break;
        }
    }
private static void showAddMenu(Scanner scanner){
    System.out.println("Choose which data to add");
    System.out.println("1: cat");
    System.out.println("2: dog");
    System.out.println("3: owner");
    System.out.println("4: receptionist");
    System.out.println("5: veterinarian");
    System.out.println("6: appointment");
    int choice = getValidatedInt(scanner, 1, 6);

    switch (choice) {
            case 1 -> addCat(scanner);
            case 2 -> addDog(scanner);
            case 3 -> addOwner(scanner);
            case 4 -> addReceptionist(scanner);
            case 5 -> addVeterinarian(scanner);
            case 6 -> addAppointment(scanner);
        }
}

 private static void showViewMenu(Scanner scanner) {
        System.out.println("Which data would you like to view?");
        System.out.println("1: Cats");
        System.out.println("2: Dogs");
        System.out.println("3: Owners");
        System.out.println("4: Receptionists");
        System.out.println("5: Veterinarians");
        System.out.println("6: Appointments");

        int choice = getValidatedInt(scanner, 1, 6);

        switch (choice) {
            case 1 -> cats.forEach(System.out::println);
            case 2 -> dogs.forEach(System.out::println);
            case 3 -> owners.forEach(System.out::println);
            case 4 -> receptionists.forEach(System.out::println);
            case 5 -> vets.forEach(System.out::println);
            case 6 -> appointments.forEach(System.out::println);
        }
    }

private static void addCat(Scanner scanner) {
        System.out.print("Enter cat name: ");
        String name = scanner.next();

        System.out.print("Enter cat age: ");
        int age = scanner.nextInt();

        System.out.print("Is the cat an indoor cat? (true/false): ");
        boolean isInside = scanner.nextBoolean();

        // In a real system you’d select an Owner from owners list
        Owner owner = null;

        cats.add(new Cat(name, age, isInside, owner));
        System.out.println("Cat added successfully!");
    }

    private static void addDog(Scanner scanner) {
        System.out.print("Enter dog name: ");
        String name = scanner.next();

        System.out.print("Enter dog age: ");
        int age = scanner.nextInt();

        Owner owner = null; // could select from list

        dogs.add(new Dog(name, age, owner));
        System.out.println("Dog added successfully!");
    }

    private static void addOwner(Scanner scanner) {
        System.out.print("Enter owner name: ");
        String name = scanner.next();

        System.out.print("Enter phone number: ");
        String phone = scanner.next();

        owners.add(new Owner(name, phone));
        System.out.println("Owner added successfully!");
    }

    private static void addReceptionist(Scanner scanner) {
        System.out.print("Enter receptionist name: ");
        String name = scanner.next();

        receptionists.add(new Receptionist(name));
        System.out.println("Receptionist added successfully!");
    }

    private static void addVeterinarian(Scanner scanner) {
        System.out.print("Enter vet name: ");
        String name = scanner.next();

        vets.add(new Veterinarian(name));
        System.out.println("Veterinarian added successfully!");
    }

    private static void addAppointment(Scanner scanner) {
        System.out.print("Enter appointment date: ");
        String date = scanner.next();

        appointments.add(new Appointment(date));
        System.out.println("Appointment added successfully!");
    }

private static int getValidatedInt(Scanner scanner, int min, int max) {
        int value = -1;
        boolean valid = false;
        while (!valid) {
            try {
                value = scanner.nextInt();
                if (value < min || value > max) {
                    throw new InvalidInputException(
                        "Invalid input. Please enter an integer from " + min + " to " + max
                    );
                }
                valid = true;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer from " + min + " to " + max);
                scanner.nextLine(); // clear buffer
            }
        }
        return value;
    }
}