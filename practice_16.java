public class practice_16 {
    public static void main(String[] args) {
        int num = -121;
        System.out.println(checkPalinNum(num));
    }
    // method to check palindrome
    public static boolean checkPalinNum(int num){
        int temp =num;
        int rev=0;
        while(num>0){
            int i = num%10;
            num /= 10;
            rev = (rev*10)+i;
        }

        if(temp==rev) return true;

        return false;
    }
    
}
