package Logical14_aug;

public class AA {
    public static void main(String[] args) {
    int a[]={20,255,2,70};
    int max=a[0];
    for (int i=0;i< a.length;i++){
       if(a[i]>max){
           max=a[i];
       }
    }
        System.out.println(max);
    }}