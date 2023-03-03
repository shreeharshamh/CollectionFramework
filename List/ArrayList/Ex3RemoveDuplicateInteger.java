package List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.LinkedHashSet;

public class Ex3RemoveDuplicateInteger {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,2,3,3,3,4,4,4,4,5,5,5,5,5));
        
        // remove duplicates from above array list using 
        // 1. LinkedHashSet
        LinkedHashSet<Integer> noDuplicates = new LinkedHashSet<>(numbers);  
        List<Integer> withoutDuplicates = new ArrayList<>(noDuplicates);
        System.out.println("With duplicate numbers : " + numbers);
        System.out.println("Without duplicate numbers : " + withoutDuplicates);

        // 2. Java 8 Streams
        List<Integer> num = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(num);
    }
}