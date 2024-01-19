import java.util.Scanner;

public class lesson_04_12 {
    public static void main(String[] args) {
        /*Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
        Должно быть введено минимум два числа. Если введено меньше двух целых чисел,
        то такую ситуацию обрабатывать не нужно,
        а программа может быть завершена с ошибкой.
        Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры.
        Если таких чисел несколько, то необходимо вывести любое из них.
        Минимальных чисел тоже может быть несколько.
         */
        Scanner number = new Scanner(System.in);
        int max1 = Integer.MAX_VALUE, max2 = Integer.MAX_VALUE;
        while (number.hasNextInt())
        {
            int x = number.nextInt();
            if (x<max1)
            {
                max2 = max1;
                max1 = x;
            }
            else if (x>max1 && x<max2)
                max2 = x;
        }
        System.out.println(max2);

    }
}
