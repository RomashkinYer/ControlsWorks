package ControlWork3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод значения x
        System.out.print("Введите значение x (0 < x < 2): ");
        double x = scanner.nextDouble();

        // Проверка диапазона
        if (x <= 0 || x >= 2) {
            System.out.println("Ошибка: x должно быть в диапазоне (0, 2).");
            return;
        }

        // Установка значения epsilon
        double epsilon = 0.0001; // Задайте нужное значение epsilon здесь

        double sum = 0.0; // Сумма ряда
        double term; // Текущий член ряда
        int n = 1; // Индекс текущего члена

        // Вычисление суммы ряда
        do {
            term = Math.pow(x - 1, n) / n; // Вычисление текущего члена
            if (n % 2 == 0) {
                term = -term; // Чередование знаков
            }
            sum += term; // Добавление текущего члена к сумме
            n++; // Увеличение индекса
        } while (Math.abs(term) >= epsilon); // Проверка условия остановки

        // Вывод результата
        System.out.printf("Сумма ряда I(x) = %.6f%n", sum);

        scanner.close();
    }
}
