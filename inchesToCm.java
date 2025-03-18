public class inchesToCm {
    public static void main(String[] args) {
      
        System.out.println(inch_to_cm(50));
        System.out.println(inch_to_cm(5,8));
    }

    public static double inch_to_cm(int inches){
        return  inches * 2.54;
    }

    public static double inch_to_cm(int feet, int inches){
        return inch_to_cm((feet * 12)+ inches );
    }
}
