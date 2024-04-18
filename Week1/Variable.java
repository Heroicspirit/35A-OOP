public class Variable {
    /* Instance variable needs object to accessed
     * Value is not shared
     */

    int instanceVariable = 10;
    /*Static variable doesnot need onject to acess
     * Value is share among objects
     */

    static int staticVariable = 100;
    public static void main(String[] args) {
        /*primitive Data Type
         * Already defined in Programming language (JAVA)
         */
        byte byteValue = 100;
        short shortValue = 100;
        int intValue = -199;
        long longValue = 10000;
        float floatValue = 2.15f;
        double doubleValue = -90.223;
        char charValue = 'l';
        boolean booleanValue = false;

        /*Non Primitive Data Types
         * NOt defined by Programming language (String)
         * combination of primitive data type
         */
        String stringValue = "This is a string value";
        int[] intArray = new int[5];
        Variable variableObject = new Variable();
        /*USe instance variable with Variable object */
        System.out.println(variableObject.instanceVariable);
        /*Use static variable with class itself */
        System.out.println(Variable.staticVariable);

        byte defaultByteValue;
        // System.out.println("Default Byte Value is "+ byteValue);
        /*
         * Continue all and find the default value of all the
         * primitive datatype
         */
        int newIntValue = 10;
        /*Implicit casting, smaller data type to larger */
        double convertInt = newIntValue;

        /*Explict casting larger data type to smaller */
        double newDoubleValue = 290.99;
        int convertedDoubleValue = (int) newDoubleValue;
    }
}
