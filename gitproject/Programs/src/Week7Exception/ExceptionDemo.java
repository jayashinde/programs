package Week7Exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a=0;
        int b=5;

        try {
            System.out.println(b / a);
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("Finally block excuted..");
        }
    }
}
