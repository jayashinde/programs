package Week4;

public class AnimalTester {
    public static void main(String[] args) {

      /*  Animal a=new Animal(4);
        System.out.println(a.age);
        Animal a1=new Animal("blue");
        System.out.println(a1.colour);
        Animal a2=new Animal(1,"white");
        System.out.println(a2.age+ " "+a2.colour);*/

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");

        Cat c1=new Cat(1);
        c1.eat();
        System.out.println(c1.age);
        Cat c2=new Cat("black Cat");
        System.out.println(c2.colour);

        System.out.println("*****************");

        Dog d1=new Dog(3);
        d1.eat();
        System.out.println(d1.age);
        Dog d2=new Dog("white Dog");
        System.out.println(d2.colour);

    }
}
