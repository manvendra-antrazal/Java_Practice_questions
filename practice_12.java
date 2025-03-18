public class practice_12 {
    public static void main(String[] args) {
        boolean summer = false;
        int temp = 24;
        System.out.println(isCatPlaying(summer,temp));
    }

    public static boolean isCatPlaying(boolean summer, int temp){

        if(summer && (temp >= 25 && temp <=45)) return true;
        if (!summer && (temp >= 25 && temp <=35)) return true;
        return false;
    }

}
