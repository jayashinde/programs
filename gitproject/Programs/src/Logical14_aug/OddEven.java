package Logical14_aug;

public class OddEven {
    public static void main(String[] args) {


        int a[]={1,2,3,4,5};
        int even=0;
        int odd=0;

        for(int i=0;i<5;i++){

            if (a[i]%2==0){
            even=even+a[i];

            }
            else {
                odd=odd+a[i];
            }
        }
        System.out.println(even+ " " +odd);






    }
}
