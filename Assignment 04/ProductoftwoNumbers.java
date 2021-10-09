import java.util.Scanner;

public class ProductoftwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter the number one : ");
        int a = in.nextInt();
        System.out.print("Enter the number two : ");
        int b = in.nextInt();

        int product = pro(a,b);
        System.out.print("The product of two numbers is " + product );
    }

     static int pro(int a,int b) {
        int product  = a * b;
         return product;

    }
}
