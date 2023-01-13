package Logical14_aug;

public class StringDemo {
    public static void main(String[] args) {
        String str="Jaya";
        String rev="";
      //  System.out.println("Original String="+str);

    for (int i= str.length()-1;i>=0;i--){
        rev=rev+ str.charAt(i);
    }
        System.out.println("Reverse String="+rev);

    }
}
