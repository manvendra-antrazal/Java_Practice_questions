public class practice_4 {
    public static void main(String[] args) {
        boolean barking = true;
        int hourOfDay =23;
        System.out.println(shouldWakeUp (barking,hourOfDay));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23) return  false; 
        if(barking != false && (hourOfDay < 8 || hourOfDay > 22)) return true;
        return false;
    }
}
