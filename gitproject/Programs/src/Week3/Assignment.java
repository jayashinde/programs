package Week3;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int age=sc.nextInt();

        if(age<18){
            System.out.println("Not Allow to work");
        }else
        {
            System.out.println("allow to work");
        }

    }
}
