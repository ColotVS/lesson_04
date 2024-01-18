import java.util.Scanner;

public class lesson_04_06 {
    public static void main(String[] args) {

        /*Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "хватит".
        Слово "enough" выводить не нужно.
        Для этого необходимо использовать бесконечный цикл (while(true)).
         */
        Scanner scanner = new Scanner(System.in);
        while (true){
            String str = scanner.nextLine();
            if (str.equals("хватит"))
                break;
            else
                System.out.println(str);
        }
    }
}
