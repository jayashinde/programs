package InterfaceProgram;

import java.util.Scanner;

public class Xyz implements Client{
    String name;
    Double salary;
   public void input() {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the name:");
       name = sc.nextLine();
       System.out.println("Enter the salary:");
       salary = sc.nextDouble();
   }


    @Override
    public void output() {
        System.out.println(name+ " "+salary);
    }

}
