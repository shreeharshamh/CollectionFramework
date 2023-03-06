package Set.TreeSet;

import java.util.TreeSet;

public class Ex2TreeSet {
    public static void main(String[] args) {
        TreeSet<Object> t = new TreeSet<>();
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("L"));
        t.add(new StringBuffer("B"));
        System.out.println(t);                      // [A, B, L, Z]
        
    }
}
