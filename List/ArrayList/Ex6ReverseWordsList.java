package List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex6ReverseWordsList {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>(Arrays.asList(
            "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"
        ));

        for(int i=0; i<planets.size(); i++) {
            System.out.print(planets.get(i) + " ");
            
        }

        System.out.println();
        Collections.reverse(planets);
        System.out.print(planets + " ");
    }
}