package Map.HashMap;

import java.util.*;

/*
 * Program to demonstrate traversing HashMap<Key, Value> 
 */

 public class Ex3TraversalOfHashMap {

    public static void threadSleep500() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // Create an instance of HashMap and add values to it using put() method
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(932293, "Harsha");
        hashMap.put(8275, "ArunKumar" );    
        hashMap.put(67538, "Rajeshwari");    
        hashMap.put(10796, "Shwetha");    
        hashMap.put(234324, "Sachin" );    
        hashMap.put(31233, "Mohan" );
        
        // Iterate over HashMap<K,V> using for-each loop
        for(Map.Entry<Integer,String> e : hashMap.entrySet()) {
            System.out.println("Key : " + e.getKey() + " Value : " + e.getValue());
            threadSleep500();
        }
    }
 }