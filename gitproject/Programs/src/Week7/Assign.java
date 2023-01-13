package Week7;

import java.util.HashMap;

public class Assign {
    public static void main(String[] args) {
        HashMap <Integer,Integer> student=new HashMap<>();
        student.put(1,15000);
        student.put(2,25000);
        student.put(3,35000);
        System.out.println(student);
        //remove
        student.remove(3);
        System.out.println(student);
        //put
        student.put(3,40000);
        //replace
        student.replace(1,20000);
        //size
        System.out.println(student.size());

        //isempty
        System.out.println(student.isEmpty());
        //clone()
        System.out.println(    student.clone());
        }
}
