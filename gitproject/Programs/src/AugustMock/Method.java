package AugustMock;

public class Method {
    public static void main(String[] args) {
      int sum=add(10,10);
        System.out.println(sum);
        double sum2=add(2,2.2);
        System.out.println(sum2);

    }
       static int add(int a, int b){
            int sum=a+b;
            return sum;
        }

        static double add(int a, double b){
         double sum2=a+b;

            return sum2;
        }





}
