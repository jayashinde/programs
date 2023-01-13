package importantQuesations;

public class StringReverse {
    public static void main(String[] args) {
        String s1="India";
        String s="";
        for (int i=s1.length()-1;i>=0;i--){
           // char c=s1.charAt(i);

            s=s+s1.charAt(i);

        }
        System.out.println(s);
    }
}
