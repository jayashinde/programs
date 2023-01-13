package Week3;

public class Student {
    int id;
    String name;
    static String college="Xpert";

    Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
        Student s1=new Student(1,"Jaya");
        System.out.println(s1.id+ " " +s1.name+ " "+college);

        Student s2=new Student(2, "Jayshree");
        System.out.println(s2.id+ " " +s2.name+ " "+college);
    }
}
