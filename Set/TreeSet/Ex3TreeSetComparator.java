package Set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * Program to illustrate use of comparator() while using DNSO 
 */
public class Ex3TreeSetComparator {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(40);      
        treeSet.add(30);
        treeSet.add(35);
        treeSet.add(40);        
        treeSet.add(45);
        System.out.println("Values of TreeSet : " + treeSet);

        // Creating a Comparator
        Comparator comparator = treeSet.comparator();
        // Print the comparator values
        System.out.println("Comparator Values : " + comparator);
        // since comparator value is null, it follows DNSO
    }
}
