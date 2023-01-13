package Week5_abstraction;

public abstract class Vehicle {

   abstract void start();
}
     class car extends Vehicle {
         void start() {
             System.out.println("Startes with key");

         }

         class bike extends Vehicle {
             void start() {
                 System.out.println("startes with kick");
             }

             public static void main(String[] args) {
                 //    Vehicle v1=new Vehicle();
                 car c1 = new car();
                 c1.start();



             }
         }
     }