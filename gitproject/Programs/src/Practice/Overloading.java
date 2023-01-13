package Practice;

public class Overloading {

    void mul(int a, int b){
        System.out.println(a*b);
    }
    void mul(int a, double b){
        System.out.println(a*b);
    }
    void mul(double a, int b){
        System.out.println(a*b);
    }


    public static void main(String[] args) {
        Overloading v1=new Overloading();
        v1.mul(5,5);
        v1.mul(5,2.2);
        v1.mul(2.2,5);

    }
}
