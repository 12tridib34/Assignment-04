import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fact = 1;
        int ans = factorial(n,fact);
        System.out.println(ans);

    }

    private static int factorial(int n, int fact) {

        while(n != 0){
            fact = fact * n;
            n--;
        }

        return fact;
    }
}
