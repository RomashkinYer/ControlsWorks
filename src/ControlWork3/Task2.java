package ControlWork3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.sqrt(3 * i);
        }

        System.out.printf("Сумма √3 + √6 + ... + √(%d) = %.2f%n", 3 * n, sum);
        scanner.close();
    }
}
