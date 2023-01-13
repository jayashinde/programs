package Week5;

import java.util.concurrent.Callable;

public class CatTester1 {
    public static void main(String[] args) {
           Cat1 c1 = new Cat1();
        System.out.println(c1.age+ " "+ c1.colour);

        Cat1 c2=new Cat1(1, "Black");
        System.out.println(c2.age+ " " +c2.colour);

        Cat1 c3=new Cat1("Black", 2);
        System.out.println(c2.colour+ " " +c2.age);

        Cat1 c4=new Cat1("white");
        System.out.println(c4.colour);

        Cat1 c5=new Cat1(5);
        System.out.println(c5.age);


            }
        }
