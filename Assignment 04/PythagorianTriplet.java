import java.util.Scanner;

public class PythagorianTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no one");
        int a = in.nextInt();
        System.out.println("Enter no two");
        int b = in.nextInt();
        System.out.println("Enter no  three");
        int c = in.nextInt();
        boolean ans = pyno(a, b, c);
        System.out.println(ans);
    }

    static boolean pyno(int a, int b, int c) {

        if (a < b && b < c) {

            if (a * a + b * b == c * c) {
                return true;
            } else {
                return false;
            }
        }

            return true;
    }
}
