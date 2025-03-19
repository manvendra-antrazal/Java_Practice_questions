public class practice_15 {
    public static void main(String[] args) {
        int odd= -1;
        System.out.println(isOdd(odd));
        int sumOdds = isOdd(13, 13);
        System.out.println("Sum of odds : " + sumOdds);
    }

    public static boolean isOdd(int odd){
        return (odd>0 && odd%2==1);
    }

    // finding sum of odds 
    public static int isOdd(int start, int end){
        int sum =0;
        if(start <0 || end <0) return -1;
        for(int i= start; i<=end; i++){
            if(i%2==1) sum+=i; 
        }
        return sum;
    }
}
