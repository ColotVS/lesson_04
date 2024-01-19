public class lesson_04_22 {
    public static void main(String[] args) {
        //Нюансы работы с вещественными числами
        //Math — математика
        //Round — круг/округлять
        //Ceiling — потолок, округляет всегда вверх
        //Floor — пол, округляет всегда вниз
        int x1 = (int) Math.round(4.1); //4
        int x2 = (int) Math.round(4.5); //5
        int x3 = (int) Math.round(4.9); //5

        int x4 = (int) Math.ceil(4.1); //5
        int x5 = (int) Math.ceil(4.5); //5
        int x6 = (int) Math.ceil(4.9); //5

        int x7 = (int) Math.floor(4.1); //4
        int x8 = (int) Math.floor(4.5); //4
        int x9 = (int) Math.floor(4.9); //4

        //оператор приведения типа — (int), так же округляет до целого вниз
        int x = (int) 4.9; //4
    }
}
