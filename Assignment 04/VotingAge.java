import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age : sa");
        int age = in.nextInt();

        votingage(age);
    }

    static void votingage(int age) {

        if(age >= 18){
            System.out.println("You are eligible to vote ");
        }else{
            System.out.println("You are not eligible to vote ");
        }
    }
}
