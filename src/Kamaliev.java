import java.util.Scanner;


public class Kamaliev{

    public static void main(String[] args) {
        System.out.println("Задание 1:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число > ");
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }
        scanner.nextLine();

        System.out.println("\nЗадание 2: ");
        System.out.print("Введите имя > ");
        String name = scanner.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав!");
        } else {
            System.out.println("Нет такого имени");
        }

        System.out.println("\nЗадание 3:");
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Числа кратные 3:");
        for (int i = 0; i < size; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
