package org.example.di;

public class Main {
    public static void main(String[] args) {
        // Here, we can inject a Sword object or Grappler object in the constructor
        // constructor-based injection
        Player link = new Player("Link", "Knight", new Sword(), 10);
        Player batman = new Player("Batman", "Dark Knight", new Grappler(), 10);

        link.useTool();
        batman.useTool();



    }
}
