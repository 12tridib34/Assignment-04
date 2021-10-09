import java.util.Scanner;

public class pn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        boolean ans = isprime(num);
        System.out.println(ans);
    }

     static boolean isprime(int num) {

        int c = 2;
        if(num <= 1){
            return false;
        }
        while(c * c <= num){
            if(num % c == 0){
                return false;
            }
            c += 1;
        }

        return c * c > num;

    }


}