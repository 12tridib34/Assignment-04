import java.util.Scanner;

public class SumoftwoNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number one : ");
        int a = in.nextInt();
        System.out.print("Enter the number two : ");
        int b = in.nextInt();
        int sum = sumof(a,b);
        System.out.print("The sum of two numbers are  : " + sum);
    }

     static int sumof(int a , int b) {
        int sum = a + b;
        return sum;
    }


}
