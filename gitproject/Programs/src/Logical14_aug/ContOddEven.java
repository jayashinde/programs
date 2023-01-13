package Logical14_aug;

public class ContOddEven {
    public static void main(String[] args) {
       int a[]={1,2,3,4,5,6,7};
        int conteven=0;
        int countodd=0;

        for (int i=0;i<a.length;i++){
          if (a[i]%2==0){
              conteven=conteven+1;
          } else {
              countodd=countodd+1;
          }
        }
        System.out.print(conteven+ "   " +countodd);
    }
}
