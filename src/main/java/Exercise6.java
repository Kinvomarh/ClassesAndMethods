public class Exercise6 {
    public static void resExersise6(){
        System.out.println(isUpperCase('A'));
        System.out.println(isUpperCase('Z'));
        System.out.println(isUpperCase('F'));
        System.out.println(isUpperCase('g'));
        System.out.println(isUpperCase('В'));
    }

    public static boolean isUpperCase(char x){
        boolean result;
        result = 'A'<=x && 'Z'>=x;
        return result;
    }
}
