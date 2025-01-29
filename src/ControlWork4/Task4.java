package ControlWork4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Отсортировать по возрастанию абсолютные значения элементов массива. Использовать метод выбора");

        double[] array = createArray();
        System.out.println("Исходный массив: ");
        printArray(array);

        selectionSortByAbsoluteValue(array);

        System.out.println("Отсортированный массив по абсолютным значениям: ");
        printArray(array);
    }
    private static void selectionSortByAbsoluteValue(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (Math.abs(array[j]) < Math.abs(array[minIndex])) {
                    minIndex = j;
                }
            }
            // Меняем местами
            double temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
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
