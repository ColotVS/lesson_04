import java.util.Scanner;

public class lesson_04_15 {
    public static void main(String[] args) {
        //Подсчет количества введенных строк с помощью цикла for
        Scanner console = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10; i++)
        {
            if (console.hasNextInt())
                count++;
            console.nextLine();
        }
        System.out.println(count);
    }
}
