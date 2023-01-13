package Collection_Practice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedDemo {
    public static void main(String[] args) {
        LinkedList <Integer> itr=new LinkedList<>();
            itr.add(10);
            itr.add(20);
            itr.add(30);
            itr.add(30);
            itr.add(40);
      //  for (Integer j:itr) {
        //    System.out.println(j);
        //}
        Iterator <Integer> j =itr.iterator();
        while (j.hasNext()){
            Integer k=j.next();
            if (k % 2 ==0){
                System.out.println(k);
            }else {
                System.out.println(j);
            }
        }


    }
}
