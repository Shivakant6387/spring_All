package org.example.Geeks;

public class Geeks {
    // define a private static instance
    public static final Geeks geeks = new Geeks();

    // private constructor
    private Geeks() {}

    // this method will return the above instance
    // which was created when the class loaded in the memory
    public static Geeks getGeeks() {
        return geeks;
    }

    // this method is used to check the dependency injection
    public void geeksMessage() {
        System.out.println("Welcome to geeksforgeeks. DI for static factory method working good");
    }
}
