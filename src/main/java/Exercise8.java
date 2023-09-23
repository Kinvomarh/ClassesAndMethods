public class Exercise8 {
    public static void resExercise8 (){
        System.out.println(isDivisor(2,6));
        System.out.println(isDivisor(8,4));
        System.out.println(isDivisor(3,7));
        System.out.println(isDivisor(14,9));

    }

    public static boolean isDivisor (int a, int b){
        boolean result;
        result = ((a%b)==0) || ((b%a)==0);
        return result;
    }
}
