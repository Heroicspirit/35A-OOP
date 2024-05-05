import java.util.Scanner;

public class week3task  {
    public static void main(String[] args) {
        float math = 34f;
        float science = 70f;
        float english = 50f;

        float mark =(math + science + english) / 3;
        System.out.println(mark);

        if(math < 35 || science < 35 || english < 35){
            System.out.println("fail");
        }else if(mark < 60) {
            System.out.println("third div");
        }else if (mark < 70){
            System.out.println("Second div");
        }else if (mark < 80){
            System.out.println("First div");
        }else if (mark > 80){
            System.out.println(" Distinction");
        }else if (mark < 0 || mark > 100){
            System.out.println("Invalid marking");
        }

         /* 2 Write a JAVA program to check whether a number is negative, positive, or zero. */
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();

        if (num<0){
            System.out.println("The number is negative");
        }else if (num>0){
            System.out.println("The number is positive");
        }else{
            System.out.println("The number is zero");
        }
        scan.close();

        
    }
}
