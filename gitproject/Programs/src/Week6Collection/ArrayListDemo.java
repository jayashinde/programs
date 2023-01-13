package Week6Collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

      ArrayList<String> s= new ArrayList<>();
      //Add the element
        s.add("Jaya");
        s.add("Jayshree");
        s.add("pihu");
        s.add("jay");
        System.out.println(s);
        //size
        System.out.println(s.size());
        s.add("god");
        s.add("java");
        System.out.println(s.size());
        System.out.println("****************************");
        //get
        System.out.println(s.get(1));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
        //removes
        s.remove(0);
        System.out.println(s.get(0));
        System.out.println(s);
        System.out.println(s.size());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        //for loop
        for (int i=0;i<s.size();i++){
            System.out.println(s.get(i));
            System.out.println("@@@@@@@@@@@@@@@@@@@@@");
         //for each
            for (String var:s) {
                System.out.println(var);

            }
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!1");
            //s.contains(1);
            System.out.println(s);
          //  System.out.println(s.get(1));
            s.set(3,"dipu");
            System.out.println(s.get(3));
            String str = "I Am Om";//
            String s1=str.valueOf(str.charAt(1));
            String  c="a";
            if(c.equals('a')){
                System.out.println("");
            }


        }

    }
}
