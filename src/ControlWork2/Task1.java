package ControlWork2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Установленный лимит на количество банок
        final int MAX_CANS = 5;
        // Цена за банку
        final double CAN_PRICE = 0.05;

        System.out.println("Добрый день!");
        System.out.print("Введите количество банок пива, которое вы хотите купить: ");
        int requestedCans = scanner.nextInt();

        // Проверка на превышение лимита
        if (requestedCans > MAX_CANS) {
            System.out.println("Упс \t(╯︵╰,) : Вы не можете заказать больше " + MAX_CANS + " банок пива(");
        } else {
            double totalCost = requestedCans * CAN_PRICE;
            System.out.println("Вы заказали " + requestedCans + " банок пива. Общая стоимость: $" + totalCost);
        }

        scanner.close();
    }
}
