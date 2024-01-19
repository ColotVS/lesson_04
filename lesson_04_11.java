import java.util.Scanner;

public class lesson_04_11 {
    public static void main(String[] args) {
        /*Программа должна считывать целые числа с клавиатуры до тех пор,
        пока не будет введено что-то другое: например, строка или символ.
        Выведи на экран максимальное четное число из введенных.
        Если введено несколько таких чисел, необходимо вывести любое из них.*/
        Scanner number = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while(number.hasNextInt())
        {
            int x = number.nextInt();
            if ((x%2)==0)
            {
                if(x>max)
                    max = x;
            }
            else
                continue;
        }
        System.out.println(max);

    }
}
