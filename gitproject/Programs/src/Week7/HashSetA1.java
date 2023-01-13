package Week7;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetA1 {
    public static void main(String[] args) {
        HashSet <Integer> Adhar =new HashSet<>();
        Adhar.add(78945612);
        Adhar.add(78942555);
        Adhar.add(12478665);
        System.out.println(Adhar);
        //SIze
        System.out.println(Adhar.size());
        //Add
        Adhar.add(4528468);
        Adhar.add(789542);
        System.out.println(Adhar.size());
        System.out.println("***************************");
        for (Integer Var:Adhar) {
            System.out.println(Var);
        }
        System.out.println("****************************");
        Iterator <Integer> itr=Adhar.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("************************************");
        //Creater another hashset
        HashSet<Integer> hashSet=new HashSet<>();
        //add Adhar into hashset
        hashSet.addAll(Adhar);
        System.out.println(hashSet);
        //remove all
        hashSet.removeAll(Adhar);
        System.out.println(hashSet);




    }
}
