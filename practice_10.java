public class practice_10 {
    public static void main(String[] args) {
        long minutes = 578600 ;
        System.out.println("Minutes in a year: " + 60*24*365);
        printYearsAndDays(minutes);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes <0) System.out.println("Invalid value");
        long year = minutes/(60*24*365);
        long extraMins = minutes-(60*24*365);  // it gives us the extra minutes 
        long days = extraMins/(60*24);    // here it convert remaning extra minutes into days 
        System.out.println(minutes + " minutes: " + year + " y and " + days + " d");
    }
}
