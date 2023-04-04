package All_Program;

import java.util.ArrayList;

/*
7. Write a Java program to test if an array list is empty or not.
 */
public class Programme7_ArrayIsEmptyOrNot {

    //main method
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>(10);
        boolean ans = arr.isEmpty();
        if (ans == true) {
            System.out.println("The ArrayList is Empty");
        } else {
            System.out.println("The ArrayList is not Empty");
        }

        arr.add(1);

        //check if array list is empty
        ans = arr.isEmpty();
        if (ans == true) {
            System.out.println("The Arraylist is empty");
        } else {
            System.out.println("The Arraylist is not empty");
        }
    }
}