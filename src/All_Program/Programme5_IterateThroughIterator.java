package All_Program;

import java.util.ArrayList;

/*
 *5. Write a Java program to iterate through all elements in an array list using Iterater.
 */
public class Programme5_IterateThroughIterator
{
    //Main method
    public static void main(String[] args) {
        // Creating an array list
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        languages.add("C#");
        System.out.println("ArrayList: " + languages);

        // Using for loop
        System.out.println("Iterating over ArrayList using for loop: ");

        for(int i = 0; i < languages.size(); i++) {
            System.out.print(languages.get(i));
            System.out.print(", ");
        }
    }
}
