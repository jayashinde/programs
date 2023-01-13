package Practice;

public class ArrayDemo {
    public static void main(String[] args) {


        //  int a[]=new int[5];
        int a[] = {1, 2, 3, 4, 5};

        for(int i=0;i<a.length-1;i++){
        System.out.print(a[i]);
        }

        System.out.println("   ");
        for (int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }

}
