package Week5_Encapsulation;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setempid(1);
        e1.setname("xyz");

        System.out.println(e1.getEmpid());
        System.out.println(e1.getname());

        }
}
