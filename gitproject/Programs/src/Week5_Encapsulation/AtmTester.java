package Week5_Encapsulation;

public class AtmTester {
    public static void main(String[] args) {
       AtmMachine a1=new AtmMachine();
       a1.setPin(8031);
        System.out.println(a1.getPin());
    }
}
