package Practice;

public class AnimalTester {
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.eat();
        Cat c2=new Cat(4);
        System.out.println("Cat legs:"+c2.legs);

        Cat c3=new Cat("white");
        System.out.println("Cat colour is:"+c3.colour);

        Cat c4=new Cat(5,"black");
        System.out.println(c4.legs+ " " +c4.colour);

        System.out.println("************************");
        Dog d1=new Dog();
        d1.eat();
        Dog d2=new Dog(5);
        System.out.println(d2.legs);
        Dog d3=new Dog("White");
        System.out.println(d3.colour);


    }
}
