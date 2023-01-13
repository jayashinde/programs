package Logical14_aug;

import java.util.Scanner;

public class MinNo {
    public static void main(String[] args) {

        int a[]={200,2,1,500};
        int min=a[0];
        for(int j=0;j<a.length;j++){
               if (a[j]<min){
                     min=a[j];
                 }
        }
        System.out.println(min);
    }
}
