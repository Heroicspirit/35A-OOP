public class switchclass {
    public static void main(String[] args) {
        char charValue = 'b';
        int intValue = 10;
        switch(charValue) {
            case 'a':
            System.out.println("apple");
            break;
        case 'b':
            switch(intValue){
                case 10:
                System.out.println("ten");
                break;
                case 20:
                System.out.println("twenty");
                break;
            }
            System.out.println("ball");
            break;
        case 'c':
            System.out.println("cat");
            break;
        case'd':
            System.out.println("dog");
            break;
        default:
            System.out.println("no word found");
            break;
        }
    }
}
