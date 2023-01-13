package Revision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collectiondemo {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();

        l1.add(29);
        l1.add(9);
        l1.add(19);
        l1.add(19);
        l1.add(22);
        l1.add(55);

        System.out.println(l1.remove(1));

        System.out.println(l1.size());
        System.out.println(l1.get(0));
        System.out.println("****************************************");
        for ( int str: l1  ) {
            System.out.println(str);
        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
     List<Integer> l2=new ArrayList<>();
        l2.addAll(l1);
        for (int str2:l2) {
            System.out.println(str2);
        }
    }

}
