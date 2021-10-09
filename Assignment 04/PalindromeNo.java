import java.util.Scanner;

public class PalindromeNo {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
     int num =in.nextInt();
     int a = num;
      int ans =  pali(num,a);
        System.out.println(ans);
    }

    private static int pali(int num,int a) {
        int rem;
        int rev = 0;
        while(num > 0){

            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num/10;
        }

        if (rev == a) {
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not palindrome");
        }

        return rev;
    }


}
