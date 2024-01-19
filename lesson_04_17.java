public class lesson_04_17 {
    public static void main(String[] args) {
        //Рисуем на экране с помощью цикла for
        for (int i = 0; i < 10; i++)
        {
            int starCount = 10 - i;
            for (int j = 0; j < starCount; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
