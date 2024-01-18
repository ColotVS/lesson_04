public class lesson_04_07 {
    public static void main(String[] args) {
        /*Вывести на экран сумму чисел от 1 до 100 включительно,
        не кратных 3. Для этого используй цикл while*/
        int sum = 0;
        int i = 0;
        while (i<100)
        {
            i++;
            if ((i%3)==0)
                continue;
            sum = sum+i;
        }
        System.out.println(sum);

    }
}
