package ControlWork3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Вычислить значения функции F на интервале от начального значения x=Xнач до конечного значения x=Xкон с шагом dX, Xнач, Xкон, dX, a, b и c задаются пользователем и являются действительными числами");

        Scanner scanner = new Scanner(System.in);

        // Ввод начального значения, конечного значения и шага
        System.out.print("Введите начальное значение X (Xнач): ");
        double Xstart = scanner.nextDouble();

        System.out.print("Введите конечное значение X (Xкон): ");
        double Xfinish = scanner.nextDouble();

        System.out.print("Введите шаг dX: ");
        double dX = scanner.nextDouble();

        // Ввод коэффициента b
        System.out.print("Введите коэффициент b: ");
        double b = scanner.nextDouble();

        // Вычисление значений функции F на заданном интервале
        System.out.println("Значения функции F на интервале от " + Xstart + " до " + Xfinish + ":");
        for (double x = Xstart; x <= Xfinish; x += dX) {
            double F = calculateFunction(b, x);
            System.out.printf("F(%.2f) = %.2f%n", x, F);
        }

        scanner.close();
    }
    public static double calculateFunction(double b, double x) {
        if (x < 5) {
            return b; // F(x) = b при x < 5
        } else if (x > 5 && b >= 0) {
            return (x - b) / x; // F(x) = (x - b) / x при x > 5 и b >= 0
        } else {
            return 0; // F(x) = 0 в остальных случаях
        }
    }
}
