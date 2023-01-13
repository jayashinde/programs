package Week4;

public class Animal {
    int age=4;
    String colour="white";

    public Animal(int age) {
        this.age = age;
    }

    public Animal(String colour) {
        this.colour = colour;
    }

    public Animal(int age, String colour) {
        this.age = age;
        this.colour = colour;
    }

    static void noise(){
        System.out.println("noise....");
    }

    void eat(){
        System.out.println("Eating.....");
    }
}
