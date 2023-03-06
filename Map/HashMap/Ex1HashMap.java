package Map.HashMap;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Demonstration of HashMap.
 * HashMap<Key, Value>
 */
public class Ex1HashMap {
    public static void main(String[] args) {
        
        // Create an instance of HashMap and entry to it
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("HondaMV", 5407);
        hashMap.put("HondaLMV", 1125);
        hashMap.put("Enfield", 1786);

        // Set --> keySet() method to retrieval all keys
        System.out.println(hashMap.keySet());

        // values --> values() method to retrieve all values
        System.out.println(hashMap.values());
        
        // entrySet() --> to retrieve each entry
        System.out.println(hashMap.entrySet());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 to add more entries : ");
        int response = scanner.nextInt();
        System.out.print("Number of entries to add : ");
        int entryNumbers = scanner.nextInt();
        if(response == 1) {
            for(int i=0; i<=entryNumbers; i++) {
                
                Scanner scanner2 = new Scanner(System.in);
                System.out.print("Enter Key : ");
                String addKey = scanner2.nextLine();
                System.out.print("Enter value : ");
                Integer addValue = scanner2.nextInt();    
                hashMap.put(addKey, addValue);
            }
        } else {System.out.println("Closing Console.");}

        scanner.close();
        
        System.out.println("Updated Entry Set" + hashMap.entrySet());
    }
}
