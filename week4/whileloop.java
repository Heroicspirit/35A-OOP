import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        /* while takes conditio/boolean expression in () */
        int count = 0;
        while(count <= 5){
            System.out.println("while Iteration"+ count);
            ++count;
        }
        /* usew while when you donot know the number of iteration
         * For eg: use while to ask user for specific number until
         * the condition is satisfied
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number");
        int intINPUT = scan.nextInt();
        while(intINPUT < 0 || intINPUT > 100) {
            System.out.println("please enter a number between 0-100");
            intINPUT = scan.nextInt();
        }
        System.out.println("condition 0-100 number "+ intINPUT);
        scan.close();
    }
}
