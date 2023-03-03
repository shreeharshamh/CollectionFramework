package List.ArrayList;

import java.util.ArrayList;
// import java.util.Collections;
import java.util.List;


/*
 * Program to reverse elements in an ArrayList
 * step 1 : add elements to ArrayList
 * step 2 : reverse using Collections.reverse() method
 * step 3 : reverse using for loop
*/
public class Ex5ReverseElements {
    public static void main(String[] args) {
        // step1 : create an instace 
        List<Integer> forwardNumbers = new ArrayList<>();
        for(int i=25; i<=50; i++) {
            if(i%2 == 0) {
                forwardNumbers.add(i);
            }
        }
        System.out.println(forwardNumbers);

        // step2 : reverse using Collections.reverse() method
        /* Collections.reverse(forwardNumbers);
        System.out.println(forwardNumbers); */

        // step3 : reverse using for loop
        List<Integer> reverseNumbers = new ArrayList<>();
        for(int i=forwardNumbers.size()-1; i>=0; i--) {
            reverseNumbers.add(forwardNumbers.get(i));
        }
        System.out.println(reverseNumbers);

    }
}