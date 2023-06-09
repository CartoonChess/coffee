package coffee;

import java.util.Scanner;
import java.util.ArrayList;

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

    private static String inputIngredients() {
        System.out.print("Enter ingredients: ");
        return input.next();
    }

    private static void runTests() {
        // Test four constructors
        WhiteChocolateMocha wcMocha = new WhiteChocolateMocha("wc ingredients");
        DarkChocolateMocha dcMocha = new DarkChocolateMocha("dc ingredients");
        CoffeeMocha cMocha = new CoffeeMocha("c ingredients");
        PeppermintMocha pMocha = new PeppermintMocha("p ingredients", 1);

        // Test inhereted setters
        wcMocha.setType("New White Chocolate Mocha");
        wcMocha.setPrice(99.99);
        wcMocha.setStoreName("Dunking Doughnuts");

        // Test inhereted getters
        System.out.println(wcMocha.getType());
        System.out.println(wcMocha.getPrice());
        System.out.println(wcMocha.getStoreName());
        System.out.println();

        // Test PeppermintMocha special setter/getter
        pMocha.setPeppermintSyrupAmount(2);
        System.out.println(pMocha.getPeppermintSyrupAmount());
        System.out.println();

        // Test overridden methods in all classes
        Coffee[] coffees = {wcMocha, dcMocha, cMocha, pMocha};
        for (Coffee coffee : coffees) {
            System.out.println(coffee.ingredient());
            coffee.howToMakeCoffee();
            coffee.prepare();
            System.out.println();
        }
    }

    public static void main(String[] args)  {
        // The delimeter allows spaces in user input
        input = new Scanner(System.in).useDelimiter("\n");

        // Holds any coffees created
        ArrayList<Coffee> coffees = new ArrayList<>();

        // To be replaced each time user creates a new drink
        String ingredients;

        while (true) {
            // Main menu
            System.out.println("The following options are available:");
            System.out.println("1. Create White Chocolate Mocha");
            System.out.println("2. Create Dark Chocolate Mocha");
            System.out.println("3. Create Coffee Mocha");
            System.out.println("4. Create Peppermint Mocha");
            System.out.println("5. Print Created Drinks");
            System.out.println("6. Run Tests");
            System.out.println("7. Exit");
            System.out.println();

            int option = getIntFromPrompt("Enter a number to choose an option: ");
            System.out.println();

            switch(option) {
                case 1:
                    ingredients = inputIngredients();
                    coffees.add(new WhiteChocolateMocha(ingredients));
                    break;
                case 2:
                    ingredients = inputIngredients();
                    coffees.add(new DarkChocolateMocha(ingredients));
                    break;
                case 3:
                    ingredients = inputIngredients();
                    coffees.add(new CoffeeMocha(ingredients));
                    break;
                case 4:
                    ingredients = inputIngredients();
                    int pumps = getIntFromPrompt("Enter number of syrup pumps: ");
                    coffees.add(new PeppermintMocha(ingredients, pumps));
                    break;
                case 5:
                    if (coffees.isEmpty()) {
                        System.out.println("No drinks have been created.");
                        break;
                    }
                    for (Coffee coffee : coffees) {
                        System.out.println(coffee.getType());
                        System.out.println(coffee.ingredient());
                        System.out.println();
                    }
                    break;
                case 6:
                    runTests();
                    break;
                case 7:
                    System.out.print("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
            System.out.println();
        }
    }
}