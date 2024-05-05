/*Task
* Use the loop to make multiplication table of 2
* 2 x 1 =2
* 2 x 2 =4
* . . 
* 2 x 10 = 20
*/
public class multitable{
    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
        System.out.printf("2  x %d = %d\n", i, 2*i);
        }
        for(int j = 1; j <6;j++){
        for(int i = 1; i < 11; i++){
            System.out.printf("%d x %d =%d\n",j,i,j*i);
        }
        System.out.println("");
    }
    }
}

