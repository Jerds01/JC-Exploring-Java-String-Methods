package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Exercise 1: length, finding the String size

        String greeting = "Hello, Cadets!";
        int length = greeting.length();
        System.out.println("The length of the string is:"+ length);

        //Exercise 2 - charAt() - Accessing a Character

        String message = "Keep Learning!";
        char character = message.charAt(5);
        System.out.println("The character is: "+ character);

        //Exercise 3 - substring() - Extracting a Part of a String

        String statement = "Java is powerful.";
        String part = statement.substring(5, 7);
        System.out.println("The extracted substring is: " + part);


    }
}