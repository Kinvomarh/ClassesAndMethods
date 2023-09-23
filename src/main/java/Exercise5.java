public class Exercise5 {
    public static void resExercise(){
        System.out.println(is2Digits(-1));
        System.out.println(is2Digits(11));
        System.out.println(is2Digits(123));
        System.out.println(is2Digits(-65));

    }
    public static boolean is2Digits(int x){
       boolean result;
       result = ((x >= 10) && (x<100)) || (x<=-10) && (x>-100);
       return result;
   }


}
