public class Operator {
    public static void main(String[] args) {

        /*Arithmetic Operator */
        int num1 = 10, num2 = 20;
        int sum = num1+num2;// here"+" is arithmetic operator
        System.out.println("num1 + num2 is"+ sum);
        System.out.println("num1 - num2 is"+ (num1-num2));
        System.out.println("num1 x num2 is"+ (num1/num2));
        System.out.println("num1 modulo num2 is"+ (num1%num2));

        /*Assignment Operator */
        int aNum1;
        aNum1 = 200; // here"=" is assignment to assign value"
        System.out.println(aNum1);
        System.out.println("aNum += can be "+ (aNum1+=2));
        /*aNum1+=2; is equivalent to aNum1 = aNum1+ 2; */
        System.out.println("aNum -= can be "+ (aNum1-=10));
        System.out.println("aNum *= can be "+ (aNum1*=3));
        System.out.println("aNum /= can be "+ (aNum1/=3));
        System.out.println("aNum %= can be "+ (aNum1%=2));

        /* Relationa; operator */
        int rNum1 = 20, rNum2 = 21;
        boolean rExpression = rNum1 == rNum2;
        System.out.println("Is rNum1 equals to rNum2" + rExpression);
        System.out.println("Is rNum1 greater to rNum2" + (rNum1 > rNum2));
        System.out.println("Is rNum1 lesser equals to rNum2" + (rNum1 <= rNum2));
        System.out.println("Is rNum1 not equals to rNum2" + (rNum1 != rNum2));

        /*logical operator */
        boolean rOperator1 = false, rOperator2 = true;
        System.out.println("rOperator1 && rOperator2" + (rOperator1 && rOperator2));
        System.out.println("Or using || " + (rOperator1 || rOperator2));
        System.out.println("NOt using ! "+ (!rOperator1));

        /* Unary Operators */
        int uNum1 = 10;
        uNum1++; // equivalent to uNum1 = uNum1 +1 and change value from next line;
        ++uNum1; // equivalent to uNum1 = uNum1 + 1 and changes value in this line;
        System.out.println("Unary for ++ "+ uNum1);
        System.out.println("Unary for operand-- "+ uNum1--);
        System.out.println("Unary for --operand "+ --uNum1);

        /*Ternary Operator */
        
        /* For example
         * String output;
         * int a = 10:
         * int b = 20;
         * if(a > b){
         * output = "True Statement";
         * }else{
         * output = "False Statement";
         * }
         * */
        /* We can use ternary for this */
        int a = 10, b = 20;
        String output = a > b ? "True Statement" : "False Statement";
        /* Here ternary takes expression ? true statement ; false statement
         * if the expressiion is ture it takes the statement after the "?"""
         * if the expressiion is false it takes the statement after the ":"""
        */
        int outputNumb = a < b ? 100: 200;
        System.out.println(output);
        System.out.println(outputNumb);

        }
}
