public class practice_3 {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);        
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
            return;
        }
        
        int temp1=kiloBytes/1024;
        int temp2=kiloBytes%1024;
        System.out.println(kiloBytes+" KB = " +temp1+" MB and "+temp2+" KB");
        
    }
    
}
