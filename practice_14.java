public class practice_14 {
    public static void main(String[] args) {
        int num =12;
        System.out.println(printNumberInWord(num));
    }

    public static String printNumberInWord(int num){
        return switch (num){
            case 0 -> {yield "ZERO";}
            case 1 -> { yield "ONE";}
            case 2 -> {yield "TWO";}
            case 3 -> {yield "Three";}
            case 4 -> {yield "Four";}
            case 5 -> { yield "FIVE";}
            case 6 -> {yield "SIX";}
            case 7 -> {yield "SEVEN";}
            case 8 -> {yield "EIGHT";}
            case 9 -> {yield "NINE";}
            default -> {yield "OTHER";}
    };
    }
}
