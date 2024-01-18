import java.util.Scanner;

public class lesson_04_02 {
    public static void main(String[] args) {
        /*Ввести с клавиатуры имя и, используя цикл while,
        10 раз вывести: <имя> хороший (переменная text).
        Каждый вывод - с новой строки.*/
        String text = " хороший";
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while (i<10)
        {
            System.out.println(name + text);
            i++;
        }
    }
}
