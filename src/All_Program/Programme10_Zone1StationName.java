package All_Program;

import java.util.HashMap;
import java.util.Scanner;

/*
10. Write a programme that tells you which line passes through particular stations. Just use Zone 1 stations name
 */
public class Programme10_Zone1StationName {

    //main method
    public static void main(String[] args) {
        char result;
        String stationName;

        System.out.println("London UnderGround Zone 1 stations");
        System.out.println("Marble Arch,Bond Street, Green Park,Piccadilly Circus,Leicester Square ,Old Street, Knightbridge, Holland Park, Westminister, Waterloo");

        HashMap<String,String> zone = new HashMap<>();
        zone.put("Marble Arch","Central line");
        zone.put("Bond Street", " Central line & Jubile Line");
        zone.put("Green Park", " Victoria line & Picadilly line & Jubile line");
        zone.put("Piccadilly Circus", " Piccadilly line & Bakerloo line");
        zone.put("Holland Park", " Central line");
        zone.put("Westminister", " Jubilee line, Circle line , District line");
        zone.put("Waterloo", " Bakerloo line & Circle line , Northern line");
        zone.put("Leicester Square", " Northern line & Piccadilly line ");
        zone.put("Old Street", " Northern line ");
        zone.put("Knightbridge", " Piccadilly line");
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Station from zone 1 to check station Name: ");
        stationName= sc.nextLine();
        for (String str : zone.keySet())
        {
            if(stationName.equals(str)) {
                System.out.println("Tube Lines" + zone.get(str));
            }
        }
        System.out.println(" ");
        System.out.println("Do You want to check again 'Y' or 'N' ");
        result = sc.next().charAt(0);
    }while(result =='Y'||result =='y');
  }
}
