public class practice_13{
    public static void main(String[] args) {
        int year = 10000;
        System.out.println(isLeapYear(year));
        int month = 12;
        System.out.println(getDaysInMonth (month,year));
    }
    public static boolean isLeapYear( int year ){
        
        if(year >=1 && year <=9999){
            if((year %4 ==0 && year%100 !=0) || year %400 ==0) {
                return true;
            }
        }
        return false;
    }
    // function of getDaysinMonth 
    public static int getDaysInMonth(int month, int year){

        if( month < 1 || month > 12) return -1;
        else if ( year < 1 || year > 9999) return -1;
        return switch (month){
            case 1,3,5,7,8,10,12 -> { yield 31 ;}
            case 2 -> {
                if(isLeapYear(year)) { yield 29; }
                else { yield 28;}
            }
            case 4,6,9,11 -> { yield 30 ;}  
            default -> { yield -1;}
        };
    }
}