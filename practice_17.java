public class practice_17 {
    public static void main(String[] args) {
        int num = -1290;
        System.out.println(first_last_dig_sum(num));
    }

    public static int first_last_dig_sum(int num ){

        if (num < 0) return -1;
        
        int last = num%10;
        int first =0;
        while(num>0){
            first = num%10;
            num /=10;
        }
        return first+last;
    }
    
}
