package Set.HashSet;

import java.util.HashSet;

/*
 * HashSet examples demonstrating usage of all four constructors
 */
public class Ex1HashSet {
    public static void main(String[] args) {
        // create an instance of HashSet and add elements
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add("Gadgets");
        hashSet.add("Terminology");
        hashSet.add(245);
        System.out.println(hashSet.add("Gadgets"));     // false
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);                      //[null, Terminology, Gadgets, 245]

        // specifying initialCapacity = 16, load factor = 60%
        HashSet<Integer> hashSet1 = new HashSet<>(16, 60);
        for(int i=0; i<8; i++) {
            hashSet1.add(i);
        }
        System.out.println(hashSet1);
    }
    
}
