package Set.LinkedHashSet;

import java.util.LinkedHashSet;

/*
 * An example to show that insertion order is preserved and duplicates are not allowed in
 * LinkedHashSet. Adding duplicate returns false because return type of add method is boolean
 * 
 */
public class Ex1LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Null");
        linkedHashSet.add("Mercury");
        linkedHashSet.add("Venus");
        linkedHashSet.add("Earth");
        linkedHashSet.add("Mars");
        linkedHashSet.add("Jupiter");
        linkedHashSet.add("Saturn");
        linkedHashSet.add("Uranus");
        linkedHashSet.add("Neptune");
        linkedHashSet.add("Pluto");

        System.out.println(linkedHashSet.add("Pluto"));     // false
        System.out.println(linkedHashSet); 
        // output :  [Null, Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune, Pluto]

    }
    
}
