package importantQuesations;

public class MaxNo {
    public static void main(String[] args) {
        int a[]={10,100000,500,2,50};
        int max=a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]>max) {
                max = a[i];
            }
            }
            System.out.println(max);
        }


}
