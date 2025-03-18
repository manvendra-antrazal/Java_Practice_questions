public class practice_11 {
    public static void main(String[] args) {
        int val1=10, val2=10, val3=20;
        printEqual(val1,val2,val3);
    }
    public static void printEqual(int val1, int val2, int val3){
        if(val1<0 && val2<0 && val3 <0) System.out.println("Invalid value");
        else if(val1 == val2 && val2== val3) System.out.println("All Values are equal");
        else if( val1 != val2 && val2 != val3 && val3 != val1) System.out.println("All values are diffrent");
        else System.out.println("Neither all are equal or different");
    }
}
