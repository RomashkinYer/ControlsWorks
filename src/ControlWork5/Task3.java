package ControlWork5;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Дано число k и матрица размера M×N. Удалить строку матрицы с номером k");

        int[][] matrix = createMatrix();
        System.out.println("Исходная матрица:");
        printMatrix(matrix);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите индекс строки для удаления (k): ");
        int k = scanner.nextInt();

        if (k >= 0 && k < matrix.length) {
            matrix = removeRow(matrix, k);
            System.out.println("Матрица после удаления строки:");
            printMatrix(matrix);
        } else {
            System.out.println("Ошибка: индекс строки вне диапазона.");
        }
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

    private static int[][] removeRow(int[][] matrix, int k) {
        int[][] newMatrix = new int[matrix.length - 1][matrix[0].length];

        for (int i = 0, newRowIndex = 0; i < matrix.length; i++) {
            if (i != k) { // Пропускаем строку с индексом k
                newMatrix[newRowIndex++] = matrix[i];
            }
        }

        return newMatrix;
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
