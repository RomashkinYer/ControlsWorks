package ControlWork3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();

        System.out.println("Числа, запись которых совпадает с последними цифрами записи квадрата:");
        for (int i = 1; i < n; i++) {
            if (i == getLastDigitsOfSquare(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    private static int getLastDigitsOfSquare(int num) {
        String squareStr = String.valueOf(num * num);
        String numStr = String.valueOf(num);

        return Integer.parseInt(squareStr.substring(squareStr.length() - numStr.length()));
    }
}

