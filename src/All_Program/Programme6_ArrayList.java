package All_Program;

import java.util.ArrayList;

/*
* 6. Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Programme6_ArrayList {

    //main method
    public static void main(String[] args) {

        ArrayList<String> list_String = new ArrayList<>();
        list_String.add("Red");
        list_String.add("Green");
        list_String.add("blue");
        list_String.add("purple");
        list_String.add("yellow");
        list_String.add("white");

        System.out.println(list_String);

        String element = list_String.get(0);
        System.out.println("First Color Element: " +element);

        element = list_String.get(2);
        System.out.println("Third Color Element: " +element);
    }
}