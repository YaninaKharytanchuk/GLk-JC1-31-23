package Task3;

import javax.sql.rowset.FilteredRowSet;
import java.util.Scanner;

public class Rainbow<firstColorNumber> {
    public static final String Red = "красный";
    public static final String Orange = "оранжевый";
    public static final String Yellow = "желтый";
    public static final String Green = "зеленый";
    public static final String Blue = "голубой";
    public static final String Рurple = "фиолетовый";
    public static final String Pink = "розовый";
    public static final String White = "белый";
    private int secondColorNumber;


    public void colorSelection() {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("""
                        Введите номер, которому соответствует, понравившийся Вам цвет:
                         1 - красный
                         2 - оранжевый
                         3 - желтый
                         4 - зеленый
                         5 - голубой
                         6 - фиолетовый
                         7 - розовый
                         8 - белый
                         """,
                Red, Orange, Yellow, Green, Blue, Рurple, Pink, White);

        System.out.print("Номер первого (1) цвета: ");
        int firstColorNumber = Integer.parseInt(scanner.next());

        System.out.print("Хотите смешать два цвета (да/нет?) - ");

        String choice = scanner.next();

        if (choice.equalsIgnoreCase("да")) {
            System.out.print("Введите номер второго (2) цвета: ");
            int secondColorNumber = Integer.parseInt(scanner.next());
            System.out.print("Выбор сделан. Ваш цвет - ");
            printTwoColor(firstColorNumber, secondColorNumber);

        } else {
            System.out.print("Выбор сделан. Ваш цвет - ");
            printTwoColor(firstColorNumber, secondColorNumber);

        }
    }

    public void printTwoColor(int firstColorNumber, int secondColorNumber) {

        switch (firstColorNumber) {
            case 1:
                System.out.print(Red);
                break;
            case 2:
                System.out.print(Orange);
                break;
            case 3:
                System.out.print(Yellow);
                break;
            case 4:
                System.out.print(Green);
                break;
            case 5:
                System.out.print(Blue);
                break;
            case 6:
                System.out.print(Рurple);
                break;
            case 7:
                System.out.print(Pink);
                break;
            case 8:
                System.out.print(White);
                break;
            default:
                System.out.println("Ошибка ввода!");

        }
    }

    }



