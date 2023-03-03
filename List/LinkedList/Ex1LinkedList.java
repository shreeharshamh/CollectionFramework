package List.LinkedList;

import java.util.LinkedList;
import java.util.List;

/*
 * Create a LinkedList of some size and add elements to it
 * perform add, remove, set operations
 */
public class Ex1LinkedList {
    public static void main(String[] args) {
        List<Object> linkedList = new LinkedList<>();
        for(int i=1; i<=100; i++) {
            if(i % 9 == 0) {
                linkedList.add(i);
            }
        }
        System.out.println(linkedList);
        // output : [9, 18, 27, 36, 45, 54, 63, 72, 81, 90, 99]

        linkedList.add(000);
        linkedList.add("Mohan");
        linkedList.remove(3);
        linkedList.set(2, 22);
        linkedList.add(1, null);
        linkedList.add(null);
        System.out.println(linkedList);
        // output :[9, null, 18, 22, 45, 54, 63, 72, 81, 90, 99, 0, Mohan, null]

        // find element at any index
        System.out.println(linkedList.get(9));
    }
}