public class practice_8 {
    public static void main(String[] args) {
        int val1=16, val2=99, val3= 67;
        System.out.println(hasTeen(val1,val2,val3));
        int teen = 18;
        System.out.println(isTeen(teen));
        
    }

    public static boolean hasTeen(int val1, int val2, int val3){
        return ((val1 >= 13 && val1 <=19) || (val2 >= 13 && val2 <=19) || (val3 >= 13 && val3 <=19));
    }

    public static boolean isTeen(int teen){
        return teen>=13 && teen <=19 ;
    }
}
