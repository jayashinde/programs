package Week2;

public class CheckDemo {
    public static void main(String[] args) {
        int age=checkAge(10);
      //  System.out.println(age);

    }
    static int checkAge(int age){
        if(age<18){
            System.out.println("Not allow to drive");
        }
        else {
            System.out.println("Allow to Drive");
        }
        return age;
    }
}
