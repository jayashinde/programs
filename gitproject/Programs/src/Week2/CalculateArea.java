package Week2;

public class CalculateArea {
    public static void main(String[] args) {
      double area=calculateArea(10,5);
        System.out.println(area);
    }
   static double calculateArea(int h, int b){
     double Area=(0.5*h*b);
     return Area;

   }
}
