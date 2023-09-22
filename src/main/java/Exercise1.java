public class Exercise1 {

    public static void resExercise1(){
        System.out.println(fraction(5.3));
        System.out.println(fraction(0.1));
        System.out.println(fraction(2.0));
        System.out.println(fraction(10.7));

    }
// Необходимо реализовать метод таким образом,
// чтобы он возвращал только дробную часть числа х.
// Подсказка: вещественное число может быть преобразовано к
// целому путем отбрасывания дробной части.

    public static double fraction(double x){
        double result;
        result = x - (int)(x);
        return result;
    }


}
