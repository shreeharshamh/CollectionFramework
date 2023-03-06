package Map.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        
        
        for(int i=0; i<=5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Key : ");
            String addKey = scanner.nextLine();
            System.out.print("Enter value : ");
            Integer addValue = scanner.nextInt();    
            hashMap.put(addKey, addValue);
        }
        System.out.println(hashMap.entrySet());
    }
}
