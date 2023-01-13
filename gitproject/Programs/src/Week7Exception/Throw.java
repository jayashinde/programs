package Week7Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throw {
    public static void main(String[] args) throws FileNotFoundException {
        Throw t1=new Throw();
        t1.dispaly();

        try {
            int a = 10, b = 0;
            System.out.println(a / b);
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("finally block excuted either exception occured or not");
        }

    }
    void dispaly()throws FileNotFoundException{
        FileInputStream f=new FileInputStream("java");
        System.out.println("Hello");
    }



}
