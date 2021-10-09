import java.util.Scanner;

public class SumofNnaturalnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int a = num;
        int ans = sum(num,a);
        System.out.println(ans);
    }

    private static int sum(int num,int a) {
        int sum = 0;
        while(num > 0){
            num -= 1;
            sum = sum + num;
        }
            sum = sum + a;
        return sum;
    }
}
