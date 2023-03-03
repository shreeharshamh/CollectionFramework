package List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Program to remove duplicate elemts from ArrayList 
 * using java8 feature : stream * 
 */

public class Ex4RemoveDuplicateWords {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(
            Arrays.asList("Ranger","Terminator","Ranger","Terminator","Ignitor"));
        
        List<String> al = arrayList.stream().distinct().collect(Collectors.toList());
        System.out.println(al);

    }
}