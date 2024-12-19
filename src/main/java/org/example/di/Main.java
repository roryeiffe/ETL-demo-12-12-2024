package org.example.di;

public class Main {
    public static void main(String[] args) {
        // Here, we can inject a Sword object or Grappler object in the constructor
        // constructor-based injection
        Player link = new Player("Link", "Knight", new Sword());
        Player batman = new Player("Batman", "Dark Knight", new Grappler());

        link.useTool();
        batman.useTool();



    }
}
