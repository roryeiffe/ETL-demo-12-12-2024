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

        Player player = new Player(name, specialization, tool);
        System.out.println(player);

    }
}
