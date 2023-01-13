package Revision;

public class InheritanceDemo {
    public static void main(String[] args) {
        Hp h1=new Hp();
        h1.sleep();
        h1.run();

     //   parent obj
        Laptop l1=new Laptop();
        l1.sleep();
       // parent ref
        Laptop l2=new Hp();
        l2.sleep();





    }
}
