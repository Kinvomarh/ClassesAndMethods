public class Exercise7 {
    public static void resExercise7(){
        System.out.println(isInRange(7,15, 9));
        System.out.println(isInRange(123,15, 77));
        System.out.println(isInRange(77,15, 9));
        System.out.println(isInRange(7,1, 8));
            }
    public static boolean isInRange(int a, int b, int num){
        boolean result;
        result = ((num<=a) && (num>=b)) || (num>=a) && (num<=b);
        return result;
    }
}
