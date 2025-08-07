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

        // Exercise 4: `tuUpperCase()` and `toLowerCase()` - Changing Case
        String mixedCase = "This Is A Test";
        String upper = mixedCase.toUpperCase();
        String lower = mixedCase.toLowerCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);

        // Exercise 5: `indexOf()` - Finding a Character or a Substring

        // Exercise 6: `equals()` vs `equalsIgnoreCase()` - Comparing Strings
        // Exercise 7: `replace()` - Replacing Characters
        // Exercise 8: Exercise 8: `trim()` - Removing Whitespace
    }
}