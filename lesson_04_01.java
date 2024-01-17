public class lesson_04_01 {
    public static void main(String[] args) {
        /*
        Используя цикл while вывести на экран сто раз сообщение (переменная quote):
        */
        String quote = "Это сообщение номер: ";
        int i = 1;
        while (i<101){
            System.out.println(quote + i);
            i++;
        }
    }
}
