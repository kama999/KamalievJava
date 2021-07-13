import java.util.Scanner;

public class Kamaliev {

    public static void main(String[] args) {
        String name1 = "Вячеслав";
        System.out.println("Задание 1 :");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Введите число > ");
        int number = scanner1.nextInt();
        if (number > 7){
            System.out.println("Привет");
        }

        System.out.println("Задание 2 : ");
        System.out.println("Введите имя > ");
        String name = scanner2.nextLine();
        if (name.equals(name1)) {
            System.out.println("Привет, " + name1 );}
        else {
            System.out.println("Нет такого имени");
        }

        System.out.println("Задание 3 : ");
        System.out.println("Введите размер массива");
        int size = scanner3.nextInt();
        int array[] = new int[size];
        System.out.println("Элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner3.nextInt();
        }
        System.out.print ("Числа  кратные 3: ");
        for (int i = 0; i < size; i++) {
            if (array[i] % 3 == 0){
        System.out.print (" " + array[i]);
        }}
        System.out.println();
        }}