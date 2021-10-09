import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        evenodd();

    }

    private static void evenodd() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = in.nextInt();

        if(a % 2 == 0){
            System.out.println("The no is even ");
        }
        else{
            System.out.println("The no is odd ");
        }
    }



    }




