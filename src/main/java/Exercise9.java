public class Exercise9 {
    public static void resExercise9(){
        System.out.println(isEqual(3, 3, 3));
        System.out.println(isEqual(15, 3, 3));
        System.out.println(isEqual(3, 6, 3));
        System.out.println(isEqual(3, 3, 7));
    }

    public static boolean isEqual (int a, int b, int c){
        boolean result;
        result = (a==b) && (a==c);
        return result;
    }
}
