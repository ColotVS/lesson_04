import java.util.Scanner;

public class lesson_04_10 {
    public static void main(String[] args) {
        /*Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
        например, строка или символ. Выведи на экран минимальное число из введенных.
        Если введено несколько таких чисел, необходимо вывести любое из них.
        Пример ввода: 8 4 9 4 5 e Пример вывода: 4
         */
        Scanner number = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (number.hasNextInt())
        {
            int x = number.nextInt();
            if (x<min)
                min=x;
        }
        System.out.println(min);
    }
}
