import java.util.Scanner;

public class lesson_04_24 {
    public static void main(String[] args) {
        //В методе main() есть переменная double glass = 0.5, которая символизирует наполовину заполненный стакан.
        // Для пессимиста он наполовину пуст, а для оптимиста - наполовину полон.
        //Необходимо считать с клавиатуры данные типа boolean, используя метод nextBoolean() объекта типа Scanner.
        // В зависимости от полученных данных, округлить переменную glass: до целого числа вниз (0),
        // если пессимист (false) и до целого числа вверх (1), если оптимист (true).
        //Результат вывести на экран.
        double glass = 0.5;
        Scanner men = new Scanner(System.in);
        boolean x = men.nextBoolean();
        if (x==true)
        {
            int i = (int) Math.ceil(glass);
            System.out.println(i);
        }
        else
        {
            int i = (int) Math.floor(glass);
            System.out.println(i);
        }
    }
}
