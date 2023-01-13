package Logical14_aug;

public class MinArray {
    public static void main(String[] args) {
       int arr[]={100,50,2,10,1};
        int i=0;
        int min=arr[0];

        while (arr[i]<min){
            min=arr[i];
            i++;
        }
    }
}
