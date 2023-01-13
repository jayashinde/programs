package Practice;

public class Animal {

    int legs;
    String colour;
    Animal(){
        System.out.println("Zero argument constructor in Animal class");
    }
  public  Animal(int legs){

        this.legs=legs;
    }
    public Animal(String colour){

        this.colour=colour;
    }
    public Animal(int legs, String colour){
        this.legs=legs;
        this.colour=colour;
    }

    void eat(){

        System.out.println("Eatting.....");
    }
  static  void makenoise(){
        System.out.println("Making noise....");
    }

}
