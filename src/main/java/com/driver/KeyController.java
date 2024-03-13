package com.driver;

import java.util.Scanner;

public class KeyController {
    private KeyService keyService;

    public KeyController(KeyService keyService) {
        this.keyService = keyService;
    }

    public void processUserInput() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addKey(scanner);
                    break;
                case 2:
                    getKeyDetails(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private void printMenu() {
        //your code goes here
        System.out.println("1. Add Key");
        System.out.println("2. Get Key Details");
        System.out.println("3. Exit");
        System.out.println("Choose an option:");
    }
    private void addKey(Scanner scanner) {
    	//your code goes here
        System.out.print("Enter key type: ");
        scanner.nextLine(); // consume newline character
        String type = scanner.nextLine();
        System.out.print("Enter key description: ");
        String description = scanner.nextLine();
        keyService.addKey(type, description);
    }

    private void getKeyDetails(Scanner scanner) {
    	//your code goes here
        System.out.print("Enter ID to fetch key details: ");
        int id = scanner.nextInt();
        Key key = keyService.getKeyById(id);
        if (key != null) {
            System.out.println("Key Details: " + key);
        } else {
            System.out.println("Key with ID " + id + " not found.");
        }
    }
    public static void main(String[] args) {
        KeyRepository keyRepository = new KeyRepository();
        KeyService keyService = new KeyService(keyRepository);
        KeyController keyController = new KeyController(keyService);
        keyController.processUserInput();
    }
}
