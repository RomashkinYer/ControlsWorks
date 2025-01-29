package ControlWork1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Проверить истинность высказывания: Точка с координатами (x, y) лежит внутри прямоугольника, левая верхняя вершина которого имеет координаты (\uD835\uDC651, \uD835\uDC661), правая нижняя —(\uD835\uDC652, \uD835\uDC662), а стороны параллельны координатным осям\".");

        Scanner scanner = new Scanner(System.in);

        // Ввод координат прямоугольника
        System.out.print("Введите координаты верхней левой вершины (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Введите координаты нижней правой вершины (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Ввод координат точки
        System.out.print("Введите координаты точки (x, y): ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        // Проверка, лежит ли точка внутри прямоугольника
        boolean isInside = (x >= x1 && x <= x2) && (y >= y2 && y <= y1);

        // Вывод результата
        if (isInside) {
            System.out.println("Точка (" + x + ", " + y + ") лежит внутри прямоугольника.");
        } else {
            System.out.println("Точка (" + x + ", " + y + ") не лежит внутри прямоугольника.");
        }

        scanner.close();
    }
}
