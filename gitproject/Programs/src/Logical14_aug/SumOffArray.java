package Logical14_aug;

public class SumOffArray {
    public static void main(String[] args) {
     /*   int a[]={1,2,3,4,5};
        int sum=0;
        for (int i=0;i<=4;i++){
            sum=sum+a[i];
        }
        System.out.println("sum="+sum);*/
        int a[]={1,2,3,4,5};
        int evenadd=0;
        int oddadd=0;
        for (int i=0;i<a.length;i++){
            if (a[i]%2==0){

                evenadd=evenadd+a[i];

            }else {
                oddadd=oddadd+a[i];
            }
        }
        System.out.println(evenadd+ " "+ oddadd);




    }
}
