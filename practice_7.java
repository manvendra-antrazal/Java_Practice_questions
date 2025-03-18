public class practice_7 {
    public static void main(String[] args) {
        int val1 =10, val2=20, sum=90;
        System.out.println(hasEqualSum(val1,val2,sum));
    }
    public static boolean hasEqualSum(int val1, int val2, int sum){
        return ((val1+val2)==sum);
    }
}
