import java.util.Scanner;

public class CircumferenceandAreaofaCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter the radius : ");
        double radius = in.nextInt();

         double circumference = cir(radius);
        System.out.println("The circumference of the circle is : " + circumference);
        double area = ar(radius);
        System.out.println("The area of the circle is : " + area);

    }

     private static double ar(double radius) {
        double pi = 3.14;
        return pi * Math.pow(radius , 2);
    }

   private static double cir(double radius) {
       double pi = 3.14;
       return 2 * pi *radius;
    }
}
