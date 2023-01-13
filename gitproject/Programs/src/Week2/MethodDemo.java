package Week2;

public class MethodDemo {
    public static void main(String[] args) {
        int addition=add(10,20);
        System.out.println(addition);
        int substraction=sub(10,5);
        System.out.println(substraction);
    }

 static int add(int a, int b) {
        int sum=a+b;
        return sum ;

    }
  static   int sub(int a, int b){
        int sub=a-b;
        return sub ;
    }
}
