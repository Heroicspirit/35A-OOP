import java.util.Scanner;

public class taskfordowhiledo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();
        while(number >=0) {
            System.out.println("enter a negative number");
            number = scan.nextInt();
    }
    System.out.println("condition meet"+ number);
    scan.close();
    }
}
