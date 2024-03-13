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

    private void addKey(Scanner scanner) {
    	//your code goes here
    }

    private void getKeyDetails(Scanner scanner) {
    	//your code goes here
    }
}
