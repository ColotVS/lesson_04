import java.util.Scanner;

public class lesson_04_03 {
    public static void main(String[] args) {
        /*Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму,
        пока пользователь не введет слово "ENTER".
        Вывести на экран полученную сумму и завершить программу.*/
        int sum = 0;
        boolean isExit = false;
        Scanner scanner = new Scanner(System.in);
        while (!isExit){
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            }
            else if (scanner.hasNextLine())
            {
                String str = scanner.nextLine();
                if(str.equals("ENTER"))
                    isExit = true;
            }
        }
        System.out.println("Сумма введеных значений равна: " + sum);

    }
}
