package StringDemo;

public class StringTest {
    public static void main(String[] args) {
        String str="jaya";
//        System.out.println(str);
//        System.out.println(str.length());
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//        String str2="   Xpert   ";
//        System.out.println(str2);
//        System.out.println(str2.trim());
//        System.out.println(str.charAt(1));
//        System.out.println(str.substring(2,4));
   for (int i=str.length()-1;i>=0;i--) {
       char c = str.charAt(i);
       System.out.print(c);

   }

    }
}
