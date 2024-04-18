public class Operatortask {
    public static void main(String[] args) {
        int num1 = 20 ;
    System.out.println("num is greater or equal to 18 " + (num1 >= 18 ));
    
    /*task 2 */
    float p= 1000f;
    float t=5f;
    float r=10f;
    float si=p*t*r/100;
    System.out.println("The simple interest of si is " + (si));

    /*task 3 */
    float length = 10f;
    float breadth = 5f;

    float area = length * breadth;
    float perimenter = 2* (length +  breadth);
    System.out.println(area);
    System.out.println(perimenter);

    /*task 4 */

    int num2=20;
    String output = num2 > 18 ? "True Statement" : "False Statement";
    System.out.println(output);

    }

}

