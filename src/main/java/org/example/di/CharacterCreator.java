package org.example.di;

import java.util.Locale;
import java.util.Scanner;

public class CharacterCreator {
    public static void main(String[] args) {
        // set up a Scanner object to retrieve user input from System.in(console)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name => ");
        String name = scanner.nextLine();

        System.out.println("You entered: " + name);

        System.out.print("Enter your specialization => ");
        String specialization = scanner.nextLine();

        System.out.println("You entered: " + specialization);


        // declare an integer to store power level
        int powerLevel = -1;
        while(true) {
            // infinitely loop and prompt user for power level
            System.out.print("Enter your power level from (1-10) => ");
            String powerLevelInput = scanner.nextLine();
            try {
                powerLevel = Integer.parseInt(powerLevelInput);
                // only break from the loop if we've successfully converted the input and it falls within the bounds
                if(powerLevel >= 1 && powerLevel <= 10) {
                    break;
                } else {
                    // if the number isn't within the bounds [1,10]
                    System.out.println("Power level must be between 1 and 10 (inclusive on both ends)");
                }
                // if we can't convert the input, print out a corresponding message and re-start the loop
            } catch (NumberFormatException numberFormatException) {
                numberFormatException.printStackTrace();
                // prompt them again:
                System.out.println("Input must be a valid integer");
            }
        }

        // If we've made it out of the loop, we can create the Player object using the specialization
        // as the basis for what tool they get
        Tool tool;
        if(specialization.toLowerCase(Locale.ROOT).equals("knight")) {
            tool = new Sword();
        }
        else if(specialization.toLowerCase(Locale.ROOT).equals("acrobat")) {
            tool = new Grappler();
        }
        else {
            tool = new WoodenSword();
        }

        Player player = new Player(name, specialization, tool, powerLevel);
        System.out.println(player);

    }
}
