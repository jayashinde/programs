package TCS;

public class StringCompare {
    public static void main(String[] args)
    {
        String str1 = "TCS";
        String str2 = "Tcs";
        CharSequence cs = "TCS";
        System.out.println("Comparing '"+str1+"'"+" and '"+cs+"' : " + str1.contentEquals(cs));
        System.out.println("Comparing '"+str2+"'"+" and '"+cs+"' :"+ str2.contentEquals(cs));
    }
}

