public class practice_18 {
    public static void main(String[] args) {
        int num = -12346;
        System.out.println(positrive_sum(num));
    }

    public static int positrive_sum(int num){
        if(num <0 ) return -1;
        int sum=0;
        while(num>0){
            int x=num%10;
            num/=10;
            if(x%2==0) sum+=x;
        }
        return sum;
    }
}
