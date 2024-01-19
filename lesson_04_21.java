import java.util.Scanner;

public class lesson_04_21 {
    public static void main(String[] args) {
        //Нужно ввести с клавиатуры два целых числа. Первое число - количество банок колы в ящике. Второе - количество людей в кабинете.
        //Вывести на экран результат деления первого числа на второе.
        //Результатом должно быть вещественное число.
        Scanner scanner = new Scanner(System.in);
        int cola = scanner.nextInt();
        int people = scanner.nextInt();
        double count = cola * 1.0 / people;
        System.out.println(count);
    }
}
