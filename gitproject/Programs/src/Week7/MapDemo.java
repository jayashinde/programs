package Week7;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> stu= new HashMap<>() ;
        //put method to put or insert the value in map
        stu.put(1,"Jaya");
        stu.put(2,"Mayu");
        stu.put(3,"Harsh");
        stu.put(4,"shree");
        System.out.println("Student key and values");
        System.out.println(stu);

        System.out.println(stu.keySet());
        System.out.println(stu.values());

        System.out.println(stu.entrySet());
        System.out.println("*************");
        stu.put(5,"arohi");
        stu.put(6,"Arohi");
        stu.put(0,"Amita");
        stu.put(7,"Amit");
        System.out.println(stu);
        System.out.println(stu.keySet());
        System.out.println(stu.values());

        System.out.println(stu.size());
        System.out.println("_________Second hashmap________");

        HashMap <Integer,String> stu2=new HashMap<>();
        stu2.put(8,"Pihu");
        stu2.put(9,"Abhi");
        System.out.println(stu2);
        stu.putAll(stu2);
        System.out.println(stu);
        System.out.println("************");
        //System.out.println(stu2.get(8));
        String  value=stu2.get(8);
        System.out.println(value);


        System.out.println("****************");
        System.out.println(stu.containsKey(9));
        System.out.println(stu.containsKey(11));
        System.out.println(stu.containsValue("Jaya"));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
               stu.replace(1,"Jayashri");
        System.out.println(stu.get(1));
        System.out.println("################");
        for (Integer RollNo:stu.keySet()) {
            System.out.println(RollNo);
        }
        for (String name:stu.values()) {
            System.out.println(name);
        }
        for (Integer roll:stu.keySet()) {
            System.out.println(roll);
           // System.out.println(stu.get());
        }




    }
}
