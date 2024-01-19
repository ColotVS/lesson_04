public class lesson_04_18 {
    public static void main(String[] args) {
        //вывести на экран прямоугольный треугольник из восьмёрок со сторонами (катетами) 10 и 10.
        for (int i = 1;i<=10;i++)
        {
            for (int j = 1; j<=i;j++)
            {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
