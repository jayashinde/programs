package Week5_Encapsulation;

public class Employee {
    //Declare varible as a private
  private   int empid;
   private String name;

    //create getter method
    public int getEmpid(){
        return empid;

    }
    public String getname(){
         return name;
    }

   //create setter method
    public void setempid(int id){
        empid=id;
    }
    public void setname(String empName){
        name=empName;
    }

}
