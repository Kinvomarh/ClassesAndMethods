public class Exercise4 {
    public static void resExercise4(){
        System.out.println(isPositive(1));
        System.out.println(isPositive(0));
        System.out.println(isPositive(-1));
        System.out.println(isPositive(-128));

    }

    public static boolean isPositive(int x){
        boolean result;
        result = x>=0;
        return result;
    }
}
