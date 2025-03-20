public class practice_24 {
    public static void main(String[] args) {
        int value = 123;
        System.out.println(getDigitCount(value));
        System.out.println(reverse(value));
        System.out.println(numberToWords(value));
    }
    // method to get count 
    public static int getDigitCount(int value){
        int count =0; 
        if(value<0) return -1;
        while (value!=0) {
            int x=value%10;
            value/=10;
            count++;
        }
        return count;
    }
    // to reverse a number
    public static int reverse(int num){
        int rev =0;
        while (num!=0) {
            int x= num%10;
            num/=10;
            rev = rev*10+x;
        }
        return rev;
    }
    // method to convert number To Words
    public static String numberToWords(int value){
        if(value<0) return "Invalid Value";
        String str = "";
        int num = reverse(value);
        while (num != 0) {
            String x = word(num % 10);
            num /= 10;
            str += x;
        }
        return str;
    }   
    
    public static String word(int val){
        return switch (val){
            case 0 -> {yield "ZERO";}
            case 1 -> {yield "ONE";}
            case 2 -> {yield "TWO";}
            case 3 -> {yield "THREE";}
            case 4 -> {yield "FOUR";}
            case 5 -> {yield "FIVE";}
            case 6 -> {yield "SIX";}
            case 7 -> {yield "SEVEN";}
            case 8 -> {yield "EIGHT";}
            case 9 -> {yield "NINE";}
            default -> {yield "Invalid Num";}
        };
    }
}
