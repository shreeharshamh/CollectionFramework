package List.ArrayList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.RandomAccess;

public class Ex1ArrayList {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add(10);              // heterogenous
        arrayList.add("A");             // duplicates allowed
        arrayList.add(null);            // null insertion possible
        System.out.println(arrayList);    // [A, 10, A, null]
        arrayList.remove(2);
        arrayList.set(1, "change");
        System.out.println(arrayList);      // [A, change, null]
        arrayList.add("random");
        System.out.println(arrayList);      // [A, change, null, random]

        // check whether ArrayList is instance of Serializable and Cloneable or not
        System.out.println(arrayList instanceof Serializable);      // True
        System.out.println(arrayList instanceof Cloneable);         // True
        System.out.println(arrayList instanceof RandomAccess);      // True

        List<Object> list = Collections.synchronizedList(arrayList);
        System.out.println(list);
    }
}