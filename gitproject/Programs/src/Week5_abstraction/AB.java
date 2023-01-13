package Week5_abstraction;

public class AB {
     void add(int a, int b){
         System.out.println(a+b);
     }

     void add(int a, double b){
         System.out.println(a+b);
     }
     void add(double a, int b){
         System.out.println(a+b);
     }

    public static void main(String[] args) {
         AB ab=new AB();
         ab.add(2,2);
         ab.add(2,2.2);
         ab.add(2.2,5);


    }

}
