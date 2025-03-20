public class practice_25 {
    public static void main(String[] args) {
        int bigCount= 2, smallCount = 2, goal= 11;
        System.out.println(canPack (bigCount,smallCount,goal));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        int bigWeight= 5;
        if(bigCount<0 || smallCount<0 || goal<0) return false;

        int totalWeight = bigWeight * bigCount;
        System.out.println(totalWeight);

        if(totalWeight>=goal){
            int remWeight = goal%bigWeight;
            if (smallCount >= remWeight)  return true;
        }
        else{
            if( smallCount >= goal - totalWeight) return true;
        }
        return false;
    }
}
