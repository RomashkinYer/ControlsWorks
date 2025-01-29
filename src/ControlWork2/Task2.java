package ControlWork2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Шар и ромб. Может ли шар радиуса r пройти через ромбообразное отверстие с диагоналями p и q?");
        Scanner scanner = new Scanner(System.in);

        // Ввод радиуса шара
        System.out.print("Введите радиус шара (r): ");
        double r = scanner.nextDouble();

        // Ввод диагоналей ромба
        System.out.print("Введите длину первой диагонали (p): ");
        double p = scanner.nextDouble();

        System.out.print("Введите длину второй диагонали (q): ");
        double q = scanner.nextDouble();

        // Вычисление длины стороны ромба
        double halfP = p / 2;
        double halfQ = q / 2;
        double sideLength = Math.sqrt(halfP * halfP + halfQ * halfQ);

        // Проверка условия
        if (2 * r <= sideLength) {
            System.out.println("Шар радиуса " + r + " может пройти через ромбообразное отверстие.");
        } else {
            System.out.println("Шар радиуса " + r + " не может пройти через ромбообразное отверстие.");
        }

        scanner.close();
    }
}
