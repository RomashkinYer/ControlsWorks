package ControlWork4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(" В одномерном массиве, состоящем из n вещественных элементов, вычислить:\n" +
                "—сумму элементов массива с нечетными номерами;\n" +
                "—сумму элементов массива, расположенных между первым и последним отрицательными элементами;");

        double[] array = createArray();
        System.out.println("Исходный массив: ");
        printArray(array);

        double oddSum = sumOddIndexedElements(array);
        double rangeSum = sumBetweenNegatives(array);

        System.out.printf("Сумма элементов с нечетными номерами: %.2f%n", oddSum);
        System.out.printf("Сумма элементов между первым и последним отрицательными элементами: %.2f%n", rangeSum);
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
    private static double sumOddIndexedElements(double[] array) {
        double sum = 0;
        for (int i = 1; i < array.length; i += 2) {
            sum += array[i];
        }
        return sum;
    }

    private static double sumBetweenNegatives(double[] array) {
        int firstNegativeIndex = -1;
        int lastNegativeIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (firstNegativeIndex == -1) {
                    firstNegativeIndex = i;
                }
                lastNegativeIndex = i;
            }
        }

        if (firstNegativeIndex != -1 && lastNegativeIndex != -1 && firstNegativeIndex < lastNegativeIndex) {
            double sum = 0;
            for (int i = firstNegativeIndex + 1; i < lastNegativeIndex; i++) {
                sum += array[i];
            }
            return sum;
        }
        return 0;
    }

    private static void printArray(double[] array) {
        for (double v : array) {
            System.out.printf("%.2f ", v);
        }
        System.out.println();
    }
}
