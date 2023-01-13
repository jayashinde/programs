package Week5_Encapsulation;

public class DemoTester {
    public static void main(String[] args) {
        Demo d1 = new Demo();
       // System.out.println(d1.a);
        System.out.println(d1.getA());
        d1.setA(5);

        Demo d2=new Demo();
        System.out.println(d2.getA());
    }
}
