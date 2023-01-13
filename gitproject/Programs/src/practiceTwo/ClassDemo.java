package practiceTwo;

public class ClassDemo {
    String name;
    ClassDemo(String name){
        this.name=name;
    }
    public void m1(){
        System.out.println("This is m1 method");

    }

    public static void main(String[] args) {

       ClassDemo d1=new ClassDemo("MM Nilanga");
       d1.m1();
        System.out.println(d1.name);

    }
}
