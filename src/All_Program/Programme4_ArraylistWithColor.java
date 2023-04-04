package All_Program;

import java.util.ArrayList;

/*
4. Write a Java program to create a new array list,
add some colours (string) and printout the collection using for each loop.
 */
public class Programme4_ArraylistWithColor
{
    //main method
    public static void main(String[] args)
    {
    ArrayList<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("blue");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        System.out.println("Colors:" + list_Strings);

        // Use for-each loop to iterate over the values in the map
        System.out.println("Different Colors: ");

        for (String Colors : list_Strings)
        {
            System.out.println(Colors);

        }
    }
}