public class practice_26 {
    public static void main(String[] args) {
        int value = 217;
        System.out.println((getLargestPrime(value)));
    }
    //  function to check largest prime 
    public static int getLargestPrime(int value){
        if(value <0 ) return -1;

        int prime_fact =0;
        if(isPrime(value)){
            return -1;  
        }
        else{
            for(int i=1; i<value; i++){
                if(value % i == 0) prime_fact = i;
            }
        } 
        return prime_fact;
    }

    // prime function
    public static boolean isPrime(int value){
        int i=2;
        while (i<value) {
            if(value%i==0) return false;
            i++;
        }
        return true;
    }
}
