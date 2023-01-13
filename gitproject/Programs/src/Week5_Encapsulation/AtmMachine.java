package Week5_Encapsulation;

public class AtmMachine {

    private int pin;

   public void setPin(int p){
        pin=p;
    }
    public int getPin(){
       if(pin==8031){
           System.out.println("Login successfuly");
       }else {
           System.out.println("Invalid pin");
       }

        return pin;
    }
}
