package ControlWork2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Чтобы привлечь посетителей и увеличить оборот, закусочная продает пиво по\n" +
                "5 центов за банку и не более 5 банок одному покупателю. Напишите программу,\n" +
                "которая будет контролировать объем каждой продажи и печатать предупреждающее сообщение, если покупатель запросит большее число банок, чем было\n" +
                "установлено");
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
