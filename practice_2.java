public class practice_2 {
    public static void main(String[] args) {
        double kilometersPerHour = 25.42;
        toMilesPerHour(kilometersPerHour);
        printConversion(kilometersPerHour);
    }

    public static long toMilesPerHour (double kilometersPerHour){
        if(kilometersPerHour < 0) return -1;
        double result = kilometersPerHour * 0.62137;
        return Math.round(result);
    }
    
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0) System.out.println("Enter valid value");
        double result = kilometersPerHour * 0.62137;
        long l = Math.round(result);
        System.out.println(kilometersPerHour +" km/h = " + l + " mi/h" );
    }
}
