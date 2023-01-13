package Logical14_aug;

public class ArrayReverse {
    public static void main(String[] args) {
    int a[]={5,10,15,20,30};
        System.out.println("Original array");

    for(int i=0;i<a.length;i++){
      System.out.print(+a[i]+" ");

    }
        System.out.println();
        System.out.println("Reverse array");

    for (int j=a.length-1;j>=0;j--){
        System.out.print(+a[j]+ " ");
    }

}


        }