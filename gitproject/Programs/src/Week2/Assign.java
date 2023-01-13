package Week2;

import java.util.Scanner;

public class Assign {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no:");
        int no=sc.nextInt();

        if(no<35){
            System.out.println("Stuend is fail");
        }
        else {
            System.out.println("Student is Pass");
        }
    }
}
