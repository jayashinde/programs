package importantQuesations;

public class Maximum {
    public static void main(String[] args) {
        int a[]={15,100,500,0};
        int max=a[0];
        for (int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }

        }
        System.out.println(max);
    }
}
