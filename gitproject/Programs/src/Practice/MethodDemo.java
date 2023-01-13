package Practice;

public class MethodDemo {
    static int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    static int sub(int a, int b){
        int t=a-b;
        return t;
    }
    public static void main(String[] args) {
        int addition=add(2,2);
        System.out.println(addition);

        int k=sub(5,2);
        System.out.println(k);

    }

}
