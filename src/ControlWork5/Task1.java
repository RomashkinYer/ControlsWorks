package ControlWork5;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Дана матрица размера N×M. Найти суммы элементов всех ее четных столбцов.");

        int[][] matrix = createMatrix();
        System.out.println("Исходная матрица:");
        printMatrix(matrix);

        int sum = sumEvenColumns(matrix);
        System.out.println("Сумма элементов всех четных столбцов: " + sum);
    }

    private static int[][] createMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк (M): ");
        int m = scanner.nextInt();
        System.out.print("Введите количество столбцов (N): ");
        int n = scanner.nextInt();

        System.out.println("Выберите способ создания массива: 1 - случайно, 2 - вручную");
        int choice = scanner.nextInt();

        if (choice == 1) {
            return createRandomMatrix(m, n);
        } else {
            return createManualMatrix(m, n);
        }
    }

    private static int[][] createRandomMatrix(int m, int n) {
        Random random = new Random();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(21) - 10; // Генерация чисел в диапазоне (-10, 10)
            }
        }
        return matrix;
    }

    private static int[][] createManualMatrix(int m, int n) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Введите элемент [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static int sumEvenColumns(int[][] matrix) {
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j += 2) { // Четные столбцы
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%3d ", value);
            }
            System.out.println();
        }
    }
}
