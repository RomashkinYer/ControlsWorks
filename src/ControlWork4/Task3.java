package ControlWork4;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double[] array = createArray();
        System.out.println("Исходный массив: ");
        printArray(array);

        double[] compressedArray = compressArray(array);

        System.out.println("Сжатый массив: ");
        printArray(compressedArray);
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
        System.out.println("Сжать массив, удалив из него все элементы, модуль которых не превышает 1.\n" +
                "Освободившиеся в конце массива элементы заполнить нулями.");

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

    private static double[] compressArray(double[] array) {
        int count = 0;

        // Считаем количество элементов, которые нужно сохранить
        for (double v : array) {
            if (Math.abs(v) > 1) {
                count++;
            }
        }

        // Создаем новый массив
        double[] compressed = new double[count];
        int index = 0;

        // Заполняем новый массив
        for (double v : array) {
            if (Math.abs(v) > 1) {
                compressed[index++] = v;
            }
        }

        return compressed;
    }

    private static void printArray(double[] array) {
        for (double v : array) {
            System.out.printf("%.2f ", v);
        }
        System.out.println();
    }
}
