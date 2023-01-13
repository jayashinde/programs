package AugustMock;

public class ConstructorDemo {
 int id;
 String name;
 static String Colleges="Xpert";
    ConstructorDemo(int id, String name){
        this.id=id;
        this.name=name;
    }
   static void display(){
        System.out.println("Static methods");
    }
    void m1(){
        System.out.println("non static methods");
    }

    public static void main(String[] args) {
        ConstructorDemo c1=new ConstructorDemo(1,"Jaya");
        System.out.println(c1.id+"  "+c1.name+ " "+Colleges);
        display();
        c1.m1();
    }
}
