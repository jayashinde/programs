package TCS;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseList {
    public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<>();


        linkedList.add("100");
        linkedList.add("200");
        linkedList.add("Nitin");
        linkedList.add("300");
        linkedList.add("400");



        Iterator<String> iterator = linkedList.descendingIterator();


        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
