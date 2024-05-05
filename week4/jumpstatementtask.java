public class jumpstatementtask {
    public static void main(String[] args) {
        for(int i=-5; i <=5; i ++){
            if(i>=0){
                break;
            }
            System.out.println("output"+ i);
        }
        for(int i=1; i <=20; i++) {
            if(i%2 !=0){
                continue;
            }
            System.out.println(i);
    }
    }
}
