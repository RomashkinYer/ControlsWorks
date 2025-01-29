package ControlWork3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int number = scanner.nextInt();

        int power = 0;
        while (number % 2 == 0) {
            number /= 2;
            power++;
        }

        System.out.printf("Наибольшая степень двойки, на которую делится заданное число: 2^%d%n", power);
        scanner.close();
    }
}
