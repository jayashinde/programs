package Week7;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {
        System.out.println("_____Started____");
        HashSet<String> courses=new HashSet<>();
        //Add elements
        courses.add("Manual Testing");
        courses.add("Api Testing");
        courses.add("Automation Testing");
        System.out.println(courses);
        //size
        System.out.println(courses.size());
        //Add or elements
        courses.add("Functional Testing");
        courses.add("Selenium");
        //size
        System.out.println(courses.size());
        System.out.println("**************************");
        //Inhenced for loop
        for (String cours:courses) {
            System.out.println(cours);
        }
        System.out.println("**************************");
// iterator
           Iterator <String> iterator=courses.iterator();
           while (iterator.hasNext()){
               System.out.println(iterator.next());
           }

        System.out.println("____finished____");

    }
}
