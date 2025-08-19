package edu.ucalgary.oop;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Main {
    private static ArrayList<Cat> cats = new ArrayList<>();
    private static ArrayList<Dog> dogs = new ArrayList<>();
    private static ArrayList<Veterinarian> vets = new ArrayList<>();
    private static ArrayList<Owner> owners = new ArrayList<>();
    private static ArrayList<Receptionist> receptionists = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();



    public static void main(String[] args) throws InvalidInputException{

        // Initialization data from database
        
        owners.add(new Owner("Alice Johnson", "alice.johnson@email.com", "555-1234"));
        owners.add(new Owner("Robert Davis", "robert.davis@email.com", "555-5678"));
        owners.add(new Owner("Laura Smith", "laura.smith@email.com", "555-8765"));

        owners.get(0).addDog("Buddy", 3, true);
        owners.get(0).addCat("Whiskers", 4, false);
        owners.get(1).addCat("Mittens", 2, true);
        owners.get(2).addDog("Charlie", 5, false);

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
        scanner.close();
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
            case 1:
            try {
                addCat(scanner);
            } 
            catch (InputNotFoundException e) {
                System.out.println(e.getMessage());
            }
            break;
            
            case 2:
            try {
                addDog(scanner);
            } 
            catch (InputNotFoundException e) {
                System.out.println(e.getMessage());
            }
            break;

            case 3: 
            {
                addOwner(scanner);
                break;
            }
            case 4: 
            {
                addReceptionist(scanner);
                break;
            }
            case 5: {
                addVeterinarian(scanner);
                break;
            }
            case 6: 
            try{
                addAppointment(scanner);
            }
            catch(InputNotFoundException e){
                System.out.println(e.getMessage());
            }
            break;
        }
}

 private static void showViewMenu(Scanner scanner) {
        System.out.println("Choose which data to view");
        System.out.println("1: Cats");
        System.out.println("2: Dogs");
        System.out.println("3: Owners");
        System.out.println("4: Receptionists");
        System.out.println("5: Veterinarians");
        System.out.println("6: Appointments");

        int choice = getValidatedInt(scanner, 1, 6);

        switch (choice) {
            case 1: viewCats(scanner);
            case 2: viewDogs(scanner);
            case 3: viewOwners(scanner);
            case 4: viewReceptionists(scanner);
            case 5: viewVets(scanner);
            case 6: appointments.forEach(System.out::println);
        }
    }

private static void addCat(Scanner scanner) throws InputNotFoundException {
        System.out.print("Enter cat name: ");
        String name = scanner.next();

        System.out.print("Enter cat age: ");
        int age = scanner.nextInt();

        System.out.print("Is the cat an indoor cat? (true/false): ");
        boolean isInside = scanner.nextBoolean();

        System.out.print("Enter owner phone number (format should be XXX-XXXX)");
        String phoneNumber = scanner.next();
        Owner owner = null;
        for(Owner owner2 : owners){
            if(owner2.getPhoneNumber().equals(phoneNumber)){
                owner = owner2;
            }
        }

        if (owner == null) {
            throw new InputNotFoundException("No owner found with phone number: " + phoneNumber);
        }

        cats.add(new Cat(name, age, isInside, owner));
        System.out.println("Cat added successfully!");
    }

    private static void addDog(Scanner scanner) throws InputNotFoundException {
        System.out.print("Enter dog name: ");
        String name = scanner.next();

        System.out.print("Enter dog age: ");
        int age = scanner.nextInt();

        System.out.print("Is the dog vaccinated(true/false)?");
        boolean isVaccinated = scanner.nextBoolean();

        System.out.print("Enter owner phone number (format should be XXX-XXXX)");
        String phoneNumber = scanner.next();
        Owner owner = null; 
        for(Owner owner2 : owners){
            if(owner2.getPhoneNumber().equals(phoneNumber)){
                owner = owner2;
            }
        }

        if (owner == null) {
            throw new InputNotFoundException("No owner found with phone number: " + phoneNumber);
        }

        dogs.add(new Dog(name, age, isVaccinated, owner));
        System.out.println("Dog added successfully!");
    }

    private static void addOwner(Scanner scanner) {
        System.out.print("Enter owner name: ");
        String name = scanner.next();

        System.out.print("Enter owner email: ");
        String email = scanner.next();

        System.out.print("Enter phone number(format should be XXX-XXXX): ");
        String phone = scanner.next();

        owners.add(new Owner(name, email, phone));
        System.out.println("Owner added successfully!");
    }

    private static void addReceptionist(Scanner scanner) {
        System.out.print("Enter receptionist name: ");
        String name = scanner.next();

        System.out.print("Enter receptionist ID: ");
        int staffId = scanner.nextInt();

        receptionists.add(new Receptionist(staffId, name));
        System.out.println("Receptionist added successfully!");
    }

    private static void addVeterinarian(Scanner scanner) {
        System.out.print("Enter vet name: ");
        String name = scanner.next();

        System.out.print("Enter vet ID: ");
        int staffId = scanner.nextInt();

        System.out.print("Enter vet specialization: ");
        String specialization = scanner.next();

        vets.add(new Veterinarian(staffId, name, specialization));
        System.out.println("Veterinarian added successfully!");
    }

    private static void addAppointment(Scanner scanner) throws InputNotFoundException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.print("Enter appointment date (e.g., 2025-08-18 20:51:00): ");
        String dateString = scanner.nextLine();
        LocalDateTime date = null;
        try {
            date = LocalDateTime.parse(dateString, formatter);
        } catch (java.time.format.DateTimeParseException e) {
            System.err.println("Error: Invalid date-time format. Please ensure it matches 'yyyy-MM-dd HH:mm:ss'.");
        } 
        finally {
        }

        System.out.print("Enter vet name: ");
        String name = scanner.nextLine();
        Veterinarian vet = null;
        for(Veterinarian vet2 : vets){
            if(vet2.getName().equals(name)){
                vet = vet2;
            }
        }
        if(vet == null){
            throw new InputNotFoundException("No veterinarian with such name");
        }

        System.out.print("Enter pet species: ");
        String species = scanner.next();
        System.out.print("Enter pet name: ");
        String petName = scanner.next();
        String catString = "cat";
        String dogString = "dog";
        Pet pet = null;
        if(species.equals(catString)){
            for(Cat cat: cats){
                if(cat.getName().equals(petName)){
                    pet = cat;
                }
            }
        }
        else if(species.equals(dogString))
        {
            for(Dog dog: dogs){
                if(dog.getName().equals(petName)){
                    pet = dog;
                }
            }
        }
        else{
            System.out.println("Invalid species name");
        }
        if(pet == null){
            throw new InputNotFoundException("No pet with such name");
        }
        System.out.print("Add any appointment notes: ");
        String notes = scanner.nextLine();        
        appointments.add(new Appointment(date, vet, pet, notes));
        System.out.println("Appointment added successfully!");
    }

    private static void viewCats(Scanner scanner){
        for(Cat cat :cats){
            System.out.print("Name: ");
            System.out.println(cat.getName());
            System.out.print("Age: ");
            System.out.println(cat.getAge());
        }
    }
    private static void viewDogs(Scanner scanner){
        for(Dog dog :dogs){
            System.out.print("Name: ");
            System.out.println(dog.getName());
            System.out.print("Age: ");
            System.out.println(dog.getAge());
        }
    }

    private static void viewOwners(Scanner scanner){
        for(Owner owner :owners){
            System.out.print("Name: ");
            System.out.println(owner.getName());
        }
    }

    private static void viewReceptionists(Scanner scanner){
        for(Receptionist receptionist :receptionists){
            System.out.print("Name: ");
            System.out.println(receptionist.getName());
        }
    }

    private static void viewVets(Scanner scanner){
        for(Veterinarian vet :vets){
            System.out.print("Name: ");
            System.out.println(vet.getName());
        }
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