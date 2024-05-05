public class forloop{
    public static void main(String[] args) {
        for(int index = 0; index < 4; index++) {
        System.out.println("loopping " + index);
        }
        /*make the table of the following  */
        for(int index = 0; index >= 0; index--) {
            System.out.println("looping decrement " + index);
        }
        /* Nested for loop
         * Loop inside loop*/
        for(int outer = 0; outer < 2; outer++) {
            for(int inner =2; inner > 0; inner--){
                System.out.println("inner"+inner);
            }
            System.out.println("outter"+outer);
        }
    }
}