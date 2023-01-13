package ExceptionDemo;

public class ExceptionDemo {
    public static void main(String[] args) {
       String s=null;

   try {
       System.out.println(s.toLowerCase());
   }catch (NullPointerException exception){
       System.out.println(exception);
   }finally {
       System.out.println("jjjjjjjjjjjjjjj");
   }
    }
}
