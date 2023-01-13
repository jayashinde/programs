package importantQuesations;

import java.util.Arrays;

public class AnagramStringDemo {
    public static boolean isAnagram(String s1, String s2){
       String str1= s1.replaceAll("\\s", "");
        String str2=s2.replaceAll("\\s", "");
        if (str1.length()!=str2.length()){
            return false;
        }else {
            char c[]=s1.toLowerCase().toCharArray();
            char c2[]=s2.toLowerCase().toCharArray();
            Arrays.sort(c);
            Arrays.sort(c2);
            return Arrays.equals(c,c2);
        }
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("cat","act"));
    }
}
