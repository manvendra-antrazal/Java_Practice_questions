public class practice_22 {
    public static void main(String[] args) {
        int para1 = 25, para2=15;
        System.out.println(getGreatestCommonDivisor(para1,para2));
    }

    public static int getGreatestCommonDivisor(int para1, int para2){

        if(para1<10 || para2<10) return -1;
        while (para2 != 0) {
            int temp = para2;
            para2 = para1 % para2;
            para1 = temp;
        }
        return para1;
    }
}
