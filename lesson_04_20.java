import java.util.Scanner;

public class lesson_04_20 {
    public static void main(String[] args) {
        //Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
        //Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.
        //Результатом должно стать целое число (тип int).
        //Для этого нужно привести к типу int результат умножения (отбросить дробную часть, округлив вниз до целого числа).
        //В качестве значения pi используй 3.14.
        Scanner num = new Scanner(System.in);
        int radius = num.nextInt();
        double pi = 3.14;
        int S = (int)(pi * radius * radius);
        System.out.println(S);
    }
}
