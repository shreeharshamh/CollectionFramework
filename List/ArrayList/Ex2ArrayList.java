package List.ArrayList;

import java.util.ArrayList;

public class Ex2ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<10; i++) al.add(i);
        
        ArrayList<Integer> arrayList = new ArrayList<>(al);
        for(int i=0; i<arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}