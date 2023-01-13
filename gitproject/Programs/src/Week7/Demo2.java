package Week7;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        Map <Integer,String> stu=new HashMap<>();
        stu.put(1,"Jaya");
        stu.put(2,"Swati");
        stu.put(3,"sana");
        System.out.println(stu);
        System.out.println(stu.size());
        for (Integer k:stu.keySet()) {
            System.out.println(k);
        }

        }

        }

