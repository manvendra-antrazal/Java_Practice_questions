public class practice_23 {
    public static void main(String[] args) {
        int num=5;
        System.out.println(isPerfectNumber (num));
    }
    public static boolean isPerfectNumber(int num){
        if(num<1) return false;
        int sum =0;
        for(int i=1; i<num; i++){
            if(num%i == 0) sum+=i;
        }
        return num==sum;
    }
}
