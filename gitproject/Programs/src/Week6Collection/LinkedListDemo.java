package Week6Collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList <String> list=new LinkedList<>();

        list.addAll(0, Collections.singleton("Jya"));
        list.add("Jayshree");
        list.add("Payal");
        list.add("Swati");
        list.add("Arati");
        //print the arraylist
        System.out.println(list);
        //get the size
        System.out.println(list.size());
        //remove the element
        list.remove(1);
        System.out.println(list);
        //check size
        System.out.println(list.size());
        //add element
        list.add("pooja");
        System.out.println(list);



      LinkedList <String> list2=new LinkedList<>();

        list2.add("nitin");
        list2.add("Om");
        list2.add("prem");

        System.out.println(list2);

       //Addall elements in list2
        list2.addAll(list);
        System.out.println("__________"+list2+"________");

        System.out.println("_____________"+list+"__________");
        System.out.println("________Remove all elements_______");
        //Removeall elements in list2
        list2.removeAll(list);
        System.out.println(list2);
        System.out.println("_____Retain all______");
        list2.retainAll(list);
        System.out.println(list);









    }
}
