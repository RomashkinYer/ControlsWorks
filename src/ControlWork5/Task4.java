package ControlWork5;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("В матрице А каждый элемент заменить минимальным среди элементов подматрицы А(i, j), расположенной в левом верхнем углу матрицы А");

        int[][] matrix = createMatrix();
        System.out.println("Исходная матрица:");
        printMatrix(matrix);

        replaceWithMinInSubmatrix(matrix);

        System.out.println("Матрица после замены:");
        printMatrix(matrix);
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

    private static void replaceWithMinInSubmatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // Находим минимальный элемент подматрицы A(0,0) до A(i,j)
                int minValue = findMinInSubmatrix(matrix, i, j);
                // Заменяем текущий элемент на найденный минимальный
                matrix[i][j] = minValue;
            }
        }
    }

    private static int findMinInSubmatrix(int[][] matrix, int rowEnd, int colEnd) {
        // Предполагаем, что подматрица всегда существует
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i <= rowEnd; i++) { // Проходим по строкам до rowEnd
            for (int j = 0; j <= colEnd; j++) { // Проходим по столбцам до colEnd
                if (matrix[i][j] < minValue) { // Находим минимальное значение
                    minValue = matrix[i][j];
                }
            }
        }

        return minValue;
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
