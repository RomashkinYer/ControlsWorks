package ControlWork6;

import java.util.ArrayList;
import java.util.Scanner;


class Detail {
    String name;
    String type;
    int quantity;
    int weight;

    public Detail(String name, String type, int quantity, int weight) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-10s %-10d %-20d", name, type, quantity, weight);
    }

}

public class DetailReport {
    private static final ArrayList<Detail> details = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить деталь");
            System.out.println("2. Просмотреть детали");
            System.out.println("3. Обновить деталь");
            System.out.println("4. Удалить деталь");
            System.out.println("5. Выход");
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    createDetail();
                    break;
                case 2:
                    readDetails();
                    break;
                case 3:
                    updateDetail();
                    break;
                case 4:
                    deleteDetail();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }

    private static void createDetail() {
        System.out.print("Введите наименование: ");
        String name = scanner.nextLine();
        System.out.print("Введите тип (О/П/З): ");
        String type = scanner.nextLine();
        System.out.print("Введите количество: ");
        int quantity = scanner.nextInt();
        System.out.print("Введите вес 1 детали (г): ");
        int weight = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        details.add(new Detail(name, type, quantity, weight));
        System.out.println("Деталь добавлена.");
    }

    private static void readDetails() {
        System.out.printf("%-15s %-10s %-10s %-20s%n", "Наименование", "Тип", "Количество", "Вес 1 детали (г)");
        System.out.println("-------------------------------------------------------------");
        for (Detail detail : details) {
            System.out.println(detail);
        }
        System.out.println("\nПримечание: О – оригинальная, П – покупная, З - заимствованная");
    }

    private static void updateDetail() {
        System.out.print("Введите номер детали для обновления (0 - " + (details.size() - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        if (index >= 0 && index < details.size()) {
            Detail detail = details.get(index);
            System.out.println("Текущие данные: " + detail);
            System.out.print("Введите новое наименование (оставьте пустым для сохранения): ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) detail.name = name;
            System.out.print("Введите новый тип (О/П/З, оставьте пустым для сохранения): ");
            String type = scanner.nextLine();
            if (!type.isEmpty()) detail.type = type;
            System.out.print("Введите новое количество (оставьте пустым для сохранения): ");
            String quantityStr = scanner.nextLine();
            if (!quantityStr.isEmpty()) detail.quantity = Integer.parseInt(quantityStr);
            System.out.print("Введите новый вес 1 детали (г) (оставьте пустым для сохранения): ");
            String weightStr = scanner.nextLine();
            if (!weightStr.isEmpty()) detail.weight = Integer.parseInt(weightStr);

            System.out.println("Деталь обновлена.");
        } else {
            System.out.println("Некорректный индекс.");
        }
    }

    private static void deleteDetail() {
        System.out.print("Введите номер детали для удаления (0 - " + (details.size() - 1) + "): ");
        int index = scanner.nextInt();
        if (index >= 0 && index < details.size()) {
            details.remove(index);
            System.out.println("Деталь удалена.");
        } else {
            System.out.println("Некорректный индекс.");
        }
    }
}
