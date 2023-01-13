package Practice;

public class Demo4 {
    {
        System.out.println("A");
    }
    static {
        System.out.println("b");
    }

    public static void main(String[] args) {
        Demo4 d=new Demo4();
        {
            System.out.println("c");
        }
        {
            System.out.println("d");
        }


    }
    static {
        System.out.println("e");
    }

}
