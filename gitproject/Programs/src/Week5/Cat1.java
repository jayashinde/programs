package Week5;

public class Cat1 {
    int age;
    String colour;
// User define constructor /no argument
    Cat1(){

    }
    //User define with argument list
    Cat1(int age , String colour){
        this.age=age;
        this.colour=colour;
    }
    Cat1(String colour,int age){
        this.colour=colour;
        this.age=age;

    }
    Cat1(String colour){
        this.colour=colour;
     //   System.out.println(this);
    }
    Cat1(int age){
        this.age=age;
    }
    void eat(){
        System.out.println(" eatting ");
    }
}
