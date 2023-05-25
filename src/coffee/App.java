package coffee;

import java.util.Scanner;

public class App {
    private static Scanner input;

    // Make sure the user enters an integer
    private static int getIntFromPrompt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String userInput = input.next();
    
            try {
                return Integer.parseInt(userInput);
            } catch (Exception err) {
                System.out.print("Make sure you enter a whole number. ");
            }   
        }
    }

    // Make sure the user enters a double
    private static double getDoubleFromPrompt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String userInput = input.next();
    
            try {
                return Double.parseDouble(userInput);
            } catch (Exception err) {
                System.out.print("Make sure you enter a number. ");
            }   
        }
    }

    public static void main(String[] args)  {
        // The delimeter allows spaces in user input
        input = new Scanner(System.in).useDelimiter("\n");

        while (true) {
            // Main menu
            System.out.println("The following options are available:");
            System.out.println("1. Create White Chocolate Mocha");
            System.out.println("2. Create Dark Chocolate Mocha");
            System.out.println("3. Create Coffee Mocha");
            System.out.println("4. Create Peppermint Mocha");
            System.out.println("5. Print Created Drinks");
            System.out.println("6. Exit");
            System.out.println();

            int option = getIntFromPrompt("Enter a number to choose an option: ");
            System.out.println();

            switch(option) {
                case 1:
                    double price = getDoubleFromPrompt("Enter price: ");
                    System.out.print("Enter store name: ");
                    String storeName = input.next();
                    System.out.print("Enter ingredients: ");
                    String ingredients = input.next();
                    WhiteChocolateMocha coffee = new WhiteChocolateMocha(price, storeName, ingredients);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.print("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid input. Please try again.");
            }
            
            // TODO: Remove
            System.out.print("");
            System.out.println("");
        }
    }
}