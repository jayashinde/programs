package Week7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<Integer,String> m1=new HashMap<>();
        m1.put(1,"Jaya");
        m1.put(2,"Mahi");
        m1.put(3,"Pihu");
        m1.put(4,"Devanshu");
        m1.put(5,"parth");

        System.out.println(m1.size());
        System.out.println(m1.isEmpty());
       // System.out.println(m1.get(m1));
        System.out.println(m1.hashCode());
        System.out.println(m1.equals(m1));
        System.out.println(m1.keySet());
    }
}
