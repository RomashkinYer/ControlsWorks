package ControlWork1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Высота равнобедренного треугольника равна h. Основание больше боковой стороны на x. Найти основание этого треугольника.\n");

        Scanner scanner = new Scanner(System.in);

        // Запрашиваем высоту треугольника
        System.out.print("Введите высоту равнобедренного треугольника (h): ");
        double h = scanner.nextDouble();

        // Запрашиваем прирост основания по сравнению с боковой стороной
        System.out.print("Введите прирост основания по сравнению с боковой стороной (x): ");
        double x = scanner.nextDouble();

        // Вычисляем основание
        double base = calculateBase(h, x);
        System.out.printf("Длина основания равнобедренного треугольника: %.2f%n", base);

        // Закрываем сканер
        scanner.close();
    }

    public static double calculateBase(double h, double x) {
        double a = (2 * x + Math.sqrt(4 * x * x + 12 * h * h)) / 6; // Боковая сторона
        double base = a + x; // Основание
        return base;
    }
}
