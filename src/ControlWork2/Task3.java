package ControlWork2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Дана ограниченная область и точка A(\uD835\uDC650, \uD835\uDC660). Написать программу, которая\n" +
                "проверяет, попадает ли точка с координатами пользователя в заданную область.");
        Scanner scanner = new Scanner(System.in);

        // Ввод координат области (прямоугольник)
        System.out.print("Введите x1 (нижний левый угол): ");
        double x1 = scanner.nextDouble();
        System.out.print("Введите y1 (нижний левый угол): ");
        double y1 = scanner.nextDouble();
        System.out.print("Введите x2 (верхний правый угол): ");
        double x2 = scanner.nextDouble();
        System.out.print("Введите y2 (верхний правый угол): ");
        double y2 = scanner.nextDouble();

        // Ввод координат точки
        System.out.print("Введите координаты точки A (x0): ");
        double x0 = scanner.nextDouble();
        System.out.print("Введите координаты точки A (y0): ");
        double y0 = scanner.nextDouble();

        // Проверка, попадает ли точка в область
        if (isPointInRectangle(x1, y1, x2, y2, x0, y0)) {
            System.out.println("Точка A(" + x0 + ", " + y0 + ") находится внутри области.");
        } else {
            System.out.println("Точка A(" + x0 + ", " + y0 + ") не находится внутри области.");
        }

        scanner.close();

    }
    // Метод для проверки, находится ли точка в прямоугольнике
    public static boolean isPointInRectangle(double x1, double y1, double x2, double y2, double x0, double y0) {
        return (x0 >= x1 && x0 <= x2) && (y0 >= y1 && y0 <= y2);
    }

}