package ControlWork4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Проверить, является ли одномерный числовой массив упорядоченным по возрастанию.");

        double[] array = createArray();
        System.out.println("Исходный массив: ");
        printArray(array);

        if (isSorted(array)) {
            System.out.println("Массив упорядочен по возрастанию.");
        } else {
            System.out.println("Массив не упорядочен по возрастанию.");
        }
    }

    private static boolean isSorted(double[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static double[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ создания массива: 1 - случайно, 2 - вручную");
        int choice = scanner.nextInt();

        if (choice == 1) {
            return createRandomArray(10);
        } else {
            return createManualArray();
        }
    }

    private static double[] createRandomArray(int size) {
        Random random = new Random();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble() * 20 - 10; // Генерация чисел в диапазоне (-10, 10)
        }
        return array;
    }

    private static double[] createManualArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int size = scanner.nextInt();
        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Введите элемент %d: ", i + 1);
            array[i] = scanner.nextDouble();
        }

        return array;
    }

    private static void printArray(double[] array) {
        for (double v : array) {
            System.out.printf("%.2f ", v);
        }
        System.out.println();
    }
}
