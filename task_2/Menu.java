import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu extends Reader_json {

    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println();
        System.out.print("Что Вы выберите: ");
    }

    public static void main(String[] args) {
        System.out.println();
        String[] options = { "1 - Разыграть приз",
                "2 - Добавить призовую игрушку",
                "0 - Выход из программы",
        };
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 0) {
            printMenu(options);
            try {
                option = scanner.nextInt();

                if (option == 1) {

                    System.out.println();
                    Reader_json.main(args);
                    System.out.println();

                }
                if (option == 2) {

                    System.out.println();
                    Append_json.main(args);
                    System.out.println();

                }

            }

            catch (InputMismatchException e) {
                System.out.println("Введите числа от 0 до 2");
                e.printStackTrace();
                scanner.nextInt();
            }

            catch (Exception ex) {
                System.out.println("An unexpected error happened. Please try again");
                scanner.nextInt();
            }

        }
        System.out.println();
        System.out.println("Вы вышли из программы!");
        System.out.println();
    }

}