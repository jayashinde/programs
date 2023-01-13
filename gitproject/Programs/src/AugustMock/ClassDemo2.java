package AugustMock;

public class ClassDemo2 {
    int id;
    String name;
    ClassDemo2 (int id, String name){
        this.id=id;
        this.name=name;

    }
    ClassDemo2( String name, int id){
        this.name=name;
        this.id=id;
    }

    public static void main(String[] args) {
        ClassDemo2 c1=new ClassDemo2(1,"JAya");

        System.out.println(c1.id+ " " +c1.name);
        ClassDemo2 c2=new ClassDemo2(2,"Jayu");
        System.out.println(c2.id+ " " +c2.name);
        ClassDemo2 c3=new ClassDemo2("Jaya",3);
        System.out.println(c3.name+ " " +c3.id);
    }
}
