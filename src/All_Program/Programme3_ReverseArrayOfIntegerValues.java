package All_Program;

import java.util.ArrayList;

/*
3. Write a Java program to reverse an array of integer values.
 */
public class Programme3_ReverseArrayOfIntegerValues {
    //main method
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);

        System.out.println(numbers);

        //Reverse of given Numbers
        System.out.println();
        System.out.println("Arraylist in Reverse order");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i));
            System.out.print(", ");
        }
    }
}