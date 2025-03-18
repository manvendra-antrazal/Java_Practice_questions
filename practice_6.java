public class practice_6 {
    public static void main(String[] args) {
        double val1= -3.176;
        double val2 = -3.175;
        System.out.println(areEqualByThreeDecimalPlaces(val1,val2));
    }

    public static boolean areEqualByThreeDecimalPlaces(double val1, double val2){
        int temp1 = (int) (val1 *1000);
        System.out.println(temp1);
        int temp2 = (int) (val2 *1000);
        System.out.println(temp2);
        if(temp1 == temp2) return true;
        return false;
    }
    
}
