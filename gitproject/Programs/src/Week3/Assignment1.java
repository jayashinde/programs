package Week3;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
    double b1 = scanner.nextDouble();

        System.out.print("Enter height: ");
    double h1 = scanner.nextDouble();

        System.out.println("Area of triangle  is: " + calculateAreaOfTriangle(b1, h1));

}

    static double calculateAreaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }  }

