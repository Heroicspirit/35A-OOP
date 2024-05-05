public class dowhileloop {
    public static void main(String[] args) {
        /*while loop checks the expression at first */
        int num1 = 0;
        while(num1 < 0 ){
            System.out.println("This will not execute");
        }

        /*Do while loop checks the expression after running a loop
         * which means do while loop runs at least once*/
        do{
            System.out.println("This will execute");
        }while(num1 < 0 );
        /*Although the expression is the same the do while will execute
         * at least once */
    }
}
