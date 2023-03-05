package Set.HashSet;

import java.util.HashSet;

/*
 * Duplicates are not allowed in HashSet.
 * The compiler returns false, because return type for add method is boolean,
 * if duplication is attempted.
 */
public class Ex2Duplicates {
    public static void main(String[] args) {
        // create a instance of HashSet and add elements to it
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add("Jupiter");
        hashSet.add("Neptune");
        hashSet.add("Uranus");
        hashSet.add("Uranus");
        hashSet.add("Mercury");
        hashSet.add("Earth");
        hashSet.add("Mars");
        hashSet.add("Mars");
        System.out.println(hashSet);            // [Earth, Neptune, Mars, Jupiter, Uranus, Mercury]

        // the compiler returns false when we try to add duplicate because
        // return type for add method is boolean
        System.out.println(hashSet.add("Mars"));    // false
        


    }
    
}
