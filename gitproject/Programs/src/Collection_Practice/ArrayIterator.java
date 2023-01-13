package Collection_Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator {
    public static void main(String[] args) {
        ArrayList <String> emp=new ArrayList<>();
         emp.add("Shinde");
         emp.add("sana");

        System.out.println(emp);
        for (String j:emp) System.out.println(j);
        Iterator itr=emp.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
