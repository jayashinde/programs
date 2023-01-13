package Logical14_aug;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.next();
        String orginal_str=str;
        String rev="";
    int len=str.length();

        for (int i=len-1;i>=0;i--){
            rev=rev+orginal_str.charAt(i);

        }
        System.out.println(rev);
        if (orginal_str.equals(rev)){
            System.out.println("This is palindome no");
        }else {
            System.out.println("This is not palindrome no");
        }

    }
        }
