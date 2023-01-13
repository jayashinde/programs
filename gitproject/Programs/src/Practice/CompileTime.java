package Practice;

public class CompileTime {
    void add(int a , int b){
        System.out.println(a+b);
    }
    void add(int a, double b){
        System.out.println(a+b);
    }
    void add(double a,int b){
        System.out.println(a+b);
    }
    void add(double a, double b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        CompileTime ct=new CompileTime();
        ct.add(10,10);
        ct.add(10,10.25);
        ct.add(5.5,5);
        ct.add(5.0,5.0);
    }
}
