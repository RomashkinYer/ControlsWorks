package ControlWork1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Высота равнобедренного треугольника равна h. Основание больше боковой стороны на x. Найти основание этого треугольника." +
                " P.S. В условии была дана сторона треугольника A, поэтому я также сделал проверку полученного основания через формулу ");

        Scanner scanner = new Scanner(System.in);

        //Ввод данных
        System.out.print("Введите высоту h: ");
        double h = scanner.nextDouble();

        System.out.print("Введите разницу между основанием и боковой стороной: ");
        double x = scanner.nextDouble();

        System.out.print("Введите сторону a: ");
        double a = scanner.nextDouble();

        //Расчет
        double b = a + x;//Находим основание

        // Проверяем теорему Пифагора
        double halfBase = b / 2;
        boolean isValid = (h * h + halfBase * halfBase == a * a);


        scanner.close();
    }
}
