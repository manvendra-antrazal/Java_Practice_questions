public class practice_1{
    public static void main(String[] args) {
        int num = -1;
        checkNumber(num);
    }

    public static void checkNumber(int number ){
        if(number>0) System.out.println("Positive");
        else if(number<0) System.out.println("Negative");
        else if(number==0) System.out.println("Zero");
    }
}