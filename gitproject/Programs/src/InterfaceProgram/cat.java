package InterfaceProgram;

public class cat implements Mamlas/*Animal*/{
    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }

    @Override
    public void makeNoise() {
        System.out.println("Cate making noise....");
    }
}
