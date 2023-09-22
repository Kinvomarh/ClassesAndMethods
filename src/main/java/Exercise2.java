public class Exercise2 {
    public static void resExercise2(){
        System.out.println(sumLastNums(1212));
        System.out.println(sumLastNums(11));
        System.out.println(sumLastNums(50101));
        System.out.println(sumLastNums(100089));
    }
//Необходимо реализовать метод таким образом,
// чтобы он возвращал результат сложения двух последних знаков числа х, п
// редполагая, что знаков в числе не менее двух. Подсказки:
//int x=123%10; // х будет иметь значение 3
//int у=123/10; // у будет иметь значение 12
    public static int sumLastNums(int x){
        int res;
        res = (x%10) + ((x/10)%10);
        return res;
    }
}
