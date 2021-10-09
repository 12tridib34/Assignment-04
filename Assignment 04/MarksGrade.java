import java.util.Scanner;

public class MarksGrade {
    public static <string> void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the marks ");
        int mrk = in.nextInt();

        String grades = grd(mrk);
        System.out.println("Grade" + grades);

    }

    static String grd(int mrk) {
        if (mrk > 100){
            System.out.println("Invalid");
        }else if (mrk >= 91 && mrk <= 100){
            System.out.println("AA");
        }else if(mrk >= 81 && mrk <= 90){
            System.out.println("AB");
        }else if(mrk >= 71 && mrk <= 80){
            System.out.println("BB");
        }else if (mrk >= 61 && mrk <= 70){
            System.out.println("BC");
        }else if(mrk >= 51 && mrk <= 60){
            System.out.println("CD");
        }else if (mrk >= 41 && mrk <= 50){
            System.out.println("DD");
        }else{
            System.out.println("Fail");
        }
        return null;
    }


}
