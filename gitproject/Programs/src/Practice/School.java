package Practice;

public class School {

    static int scholId=103;
    int DepalNo;
    String Branch;

   public School(){

    }
   public School(int DepalNo){

       this.DepalNo=DepalNo;
    }
    public School(String Branch){

       this.Branch=Branch;
    }
    School(int DepalNo, String Branch){
           this.DepalNo=DepalNo;
           this.Branch=Branch;
    }


  void admission(){
      System.out.println("Admit the student in schol");
    }


    public static void main(String[] args) {
        School s1=new School(1,"Computer");
        School s2=new School(2,"Physics");
        System.out.println(s1.DepalNo+ " " +s1.Branch+ " "+scholId);
        System.out.println(s2.DepalNo+ " " +s2.Branch+ " "+scholId);
        s1.admission();
        s2.admission();

    }
}
