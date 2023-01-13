package Week6Collection;

import java.util.ArrayList;
import java.util.Collections;

public class A {
    public static void main(String[] args) {
       ArrayList<Integer> i=new ArrayList<>();
         i.add(1);
         i.add(2);
         i.add(3);
         i.add(5);
         i.add(4);
         Collections.sort(i);
        System.out.println(i);
        Collections.shuffle(i);
        System.out.println(i);

    }
}
