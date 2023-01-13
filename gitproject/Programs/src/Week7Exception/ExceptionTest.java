package Week7Exception;

public class ExceptionTest {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);

        }catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finaaly block....");
        }
    }
}
