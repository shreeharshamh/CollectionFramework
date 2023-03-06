package Set.TreeSet;

import java.util.TreeSet;

public class Ex1TreeSet {
    public static void main(String[] args) {
        TreeSet<Object> t = new TreeSet<>();
        t.add("A");     // unicode is 65
        t.add("a");     // unicode is 97
        t.add("B");
        t.add("Z");
        t.add("L");
        System.out.println(t);  // [A, B, L, Z, a]

        // t.add(10);       // throws ClassCastException (RE:CCE)
        // t.add(null);     // RE:NPE : if you're trying to insert null into non-emptytreesets
    }
}
