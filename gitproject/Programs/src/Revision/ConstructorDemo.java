package Revision;

public class ConstructorDemo {
    int id;
    String name;

    ConstructorDemo(int id, String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
        ConstructorDemo d1=new ConstructorDemo(1,"Jaya");
        System.out.println(d1.id+ "  " +d1.name);
        ConstructorDemo d2=new ConstructorDemo(2,"Devanshu");
        System.out.println(d2.id+ "  " +d2.name);
    }}

