package All_Program;

import java.util.HashSet;

/*
8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if else)
 */
public class Programme8_HashSetStores {
    //main method
    public static void main(String[] args) {
         //Creating Hashset
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        System.out.println(numbers);

        for (int i = 1; i <= 10; i++)
        {
            if (numbers.contains(i)) {
                System.out.println(" Number " + i + " does exist in set. ");
            } else {
                System.out.println(" Number " + i + " does not exists. ");
            }
        }
    }
}