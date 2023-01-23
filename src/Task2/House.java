package Task2;

public class House {
    private static byte floor = 4; // Объявление глобальных переменных
    private static short entrance = 7;
    private static int room = 87;
    private static char symbol = 'W';
    private static String area = "luck";
    private static double point1 = 13.001;
    private static Integer i = 111;
    private static Double d = 2.588;
    private static Boolean bo = false;

    public static void main(String[] args) {
        int i = 5; // Приведение int в byte
        byte b = (byte) i; // Приведение byte в char
        char g = (char) b;
        long o = 8888; // Приведение long в float
        float k = o;
        boolean values = true;
        char number = 'f'; // Приведение char в int
        int a = number;
        byte w = 8;
        short d = (byte) w;
        float z = 1.111f; // Приведение float в double
        double j = (float) z;
        int max = Math.max(10, 5);
        int min = Math.min(10, 5);
        Character cr = '/';// Создание оболочек
        Long l = 235L;
        Short s = 12;

        Room test1 = new Room();  //Создание объектов на основе класса Test
        Room test2 = new Room();

        System.out.println("Работа с сеттерами room = "+test2.getRoom()); //  Работа с сеттерами и геттерами
        test2.getRoom();
        System.out.println("Работа с сеттерами height = "+test2.getHeight());
        test2.getHeight();
        System.out.println("Работа с сеттерами Meaning2 = "+test2.getMeaning2());
        test2.getMeaning2();
        System.out.println(b); // Вывод переменных на консоль
        System.out.println(g);
        System.out.println(k);
        System.out.println(values);
        System.out.println(a);
        System.out.println(b);
        System.out.println(j);
        System.out.println(min);
        System.out.println(max);
        System.out.println(cr);
        System.out.println(l);
        System.out.println(s);
        System.out.println("cr = "+ cr);
        System.out.println("l = "+ l);
        System.out.println("s = "+ s);

    }

}
