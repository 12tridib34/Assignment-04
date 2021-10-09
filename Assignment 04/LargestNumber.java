import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first no : ");
        int a = in.nextInt();
        System.out.println("Enter the second no : ");
        int b = in.nextInt();
        System.out.println("Enter the third  no : ");
        int c = in.nextInt();

        int max = MaxNo(a , b ,c);
        System.out.println("The maximum number is " + max);
        int min = MinNo(a , b , c);
        System.out.println("The minimum no is " + min);

    }

    private static int MinNo(int a, int b, int c) {
        int minNo = a;
        if (b < a){
            minNo =b;
        }
        if (c < b){
            minNo = c;
        }
        return minNo;
    }

    private static int MaxNo(int a, int b, int c) {

        int maxNo = Math.max(c,Math.max(a,b));
        return maxNo;


    }


}
