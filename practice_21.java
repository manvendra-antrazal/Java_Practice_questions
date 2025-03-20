public class practice_21 {
    public static void main(String[] args) {
        int num =-1;
        printFactors(num);
    }

    public static void printFactors(int num){
        if(num<0) System.out.println("Invalid Value");
        int i =1;
        while(i<=num){
            if(num%i==0) System.out.print(i+ " , ");
            i++;
        }
    }   
}
