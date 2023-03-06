package Set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * demonstration using comparator to create a customized sorting
 */
class Helper implements Comparator<String> {
    public int compare(String str1, String str2) {
        String first_str;
        String second_str;

        first_str = str1;
        second_str = str2;

        return second_str.compareTo(first_str);
    }
}
public class Ex4TreeSetComparator {
    
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("G");
        treeSet.add("E");
        treeSet.add("E");
        treeSet.add("K");
        treeSet.add("S");
        treeSet.add("4");

        System.out.println("Before using the comparator : " + treeSet);

        // Again creating an empty TreeSet of string type
        // with reference to Helper class
        TreeSet<String> treeSet1 = new TreeSet<String>(new Helper());
        treeSet1.add("G");
        treeSet1.add("E");
        treeSet1.add("E");
        treeSet1.add("K");
        treeSet1.add("S");
        treeSet1.add("4");

        // Printing elements in set before using comparator
        System.out.println("The elements sorted in descending order:" + treeSet1);
   
    }
    
}
