public class week3java {
    public static void main(String[] args) {
        /* IF statement  */
        if (true){
            System.out.println("true statement");
        }
        // The parenthesis takes a boolean expression
        int num1 = 10, num2 = 20;
        if (num1==num2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    /* note that the else statement is always optional */
        /* if else if */
        if (num1==num2){
            System.out.println("equal");
        }else if (num1 < num2) {
            System.out.println("lesser");
        }else{
            System.out.println("not equal");
        }
        /* note that else should be at the last when using else if */
        /* if else if ladder */
        if (num1 == num2){
            System.out.println("equal");
        }else if(num1 > num2) {
            System.out.println("lesser");
        }else if (num1 != num2) {
            System.out.println("not equal");
        }else if (num1 > 0){
            System.out.println("positive");
        }else{
            System.out.println("default statement");
        }
        /*when a condition is matched it will skip all the reamining statement  */
        /* nested if else */
        if (num1 > 0 ){
            if(num1 > num2){
                System.out.println("Positive greater");
            }else{
                System.out.println("Positive lesser");
            }
        }else{
            if (num1 > num2){
                System.out.println("Negative greater");
            }else{
                System.out.println("Negative lesser");
            }
        }
    }
}
