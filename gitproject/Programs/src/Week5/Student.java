package Week5;

public class Student {
    int id;
    String name;
    static String collegename="Xpert";

    Student(){

    }

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    Student(int id){
        this.id=id;
        System.out.println(this);
    }
    Student(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        Student s=new Student();
       System.out.println(s);

        Student s1=new Student(1, "jaya");
        System.out.println(s1.id+ " "+s1.name+ " " +collegename);

        Student s2=new Student(1);
        System.out.println(s2.id);

        Student s3=new Student("jaya");
        System.out.println(s3.name);

    }
}
