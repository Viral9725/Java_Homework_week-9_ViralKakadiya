package All_Program;

import java.util.HashMap;

/*
9. Create a HashMap object called people that will store String keys and Integer values:
And use for each loop to iterate the value from Map
 */
public class Programme9_HashMapObjectMap
{
    //Main method
    public static void main(String[] args) {
        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String,Integer>();

        // Add some key-value pairs to the map
        people.put("John", 20);
        people.put("Steve", 30);
        people.put("Ram", 40);
        people.put("Mahesh", 35);
        people.put("Jim", 50);

        System.out.println("HashMap:" + people);

        // Use for-each loop to iterate over the values in the map
        System.out.println("\n Person Name and Values: ");
        for (String i : people.keySet()) {
            System.out.println(" Person Name : " +i+ " Value: " +people.get(i));
        }
    }
}
