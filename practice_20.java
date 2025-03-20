public class practice_20 {
    public static void main(String[] args) {
        int v1=10, v2 = 21 , v3 = 20, num=11;
        System.out.println(hasSameLastDigit (v1,v2,v3));
        System.out.println(isValid(num));
    }
    public static boolean hasSameLastDigit(int a,int b, int c){

        if((a>10 || a<1000) && (b>10 || b<1000) || (c>10 || c<1000)) return false;
        int tempA= a%10;
        int tempB = b%10;
        int tempC = c%10;
        if((tempA == tempB) || (tempB == tempC) || (tempC == tempA)) return true;
        return false;
    }

    // is valid 
    public static boolean isValid (int num ){
        return (num>10 && num<1000) ;
    }
}
