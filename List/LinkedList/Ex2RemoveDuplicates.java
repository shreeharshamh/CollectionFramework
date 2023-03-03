package List.LinkedList;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Create List of random elements
 * perform add, remove, set operations
 * remove random elements
 * reverse elements in linkedlist
 */
public class Ex2RemoveDuplicates {
    
    
    public static void main(String[] args) {
        List<Object> randomWords = new LinkedList<>();
        // add elements
        randomWords.add(100);
        randomWords.add("randomWords");
        randomWords.add("Japan");
        randomWords.add(564);
        randomWords.add(564);
        randomWords.add("Japan");
        randomWords.add("Japan");

        // remove elements
        randomWords.remove(1);

        // remove duplicates using stream
        List<Object> rw = randomWords.stream().distinct().collect(Collectors.toList());
        System.out.println(rw);
        // or using LinkedHashSet
        LinkedHashSet<Object> lhs = new LinkedHashSet<>(rw);
        System.out.println(lhs);

        // reverse element order
        Collections.reverse(rw);
        System.out.println(rw);



    }
}
