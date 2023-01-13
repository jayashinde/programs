package Logical14_aug;

public class Factorial {
    public static void main(String[] args) {

        int no=5;
  long factorial=1;
        for(int i=1;i<=5;i++){
           factorial=factorial*i;//1*1=1;1*2=2;2*3=6;6*4=24;24*5=120;
        }
        System.out.println(factorial);
    }

}