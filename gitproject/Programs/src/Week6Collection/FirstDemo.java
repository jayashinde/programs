package Week6Collection;

import java.util.ArrayList;

public class FirstDemo {
    public static void main(String[] args) {
        //creating array list
        ArrayList <String> list =new ArrayList<>();
        list.add("jaya");
        list.add("sneha");
        list.add("jyoti");
        list.add("priya");
        list.add("pihu");
        System.out.println(list);
        //delete the element in given array list
       list.remove(0);
        System.out.println(list);
        //add elements
        list.add("Jayshree");
        System.out.println(list);
        //cleare all elements
       list.clear();
        System.out.println(list);

        ArrayList<Integer> at=new ArrayList<Integer>();
        //add elements
        at.add(10);
        at.add(20);
        at.add(30);
        System.out.println(at);
        //remove elements
      at.remove(1);
        System.out.println(at);

    }
}
