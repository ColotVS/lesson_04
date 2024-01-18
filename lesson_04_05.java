public class lesson_04_05 {
    public static void main(String[] args) {
        /*Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник
        (его контур) размером 10 (высота) на 20 (ширина) из букв 'Б'.
        Незаполненная часть состоит из пробелов.
         */
        int i = 0;
        while (i<10)
        {
            int j = 0;
            while (j < 20)
            {
                if (i==0)
                {
                    System.out.print("Б");
                    j++;
                }
                else if (i==9)
                {
                    System.out.print("Б");
                    j++;
                }
                else if (j==0)
                {
                    System.out.print("Б");
                    j++;
                }
                else if (j==19)
                {
                    System.out.print("Б");
                    j++;
                }
                else
                {
                    System.out.print(" ");
                    j++;
                }


            }
            System.out.println();
            i++;
        }

    }
}

