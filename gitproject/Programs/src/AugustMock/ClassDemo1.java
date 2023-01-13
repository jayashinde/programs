package AugustMock;

public class ClassDemo1 {
    {
        System.out.println("a");
    }
   static  {
        System.out.println("c");
    }
    {
        System.out.println("b");
    }
    public static void main(String[] args) {
        ClassDemo1 d1=new ClassDemo1();

    }
    {
        System.out.println("d");
    }
}
