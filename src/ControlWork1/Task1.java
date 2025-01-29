package ControlWork1;

import java.util.Scanner;

public class Task1{

    public static void main(String[] args) {
        System.out.println("За какое время самолет, движущийся со скоростью 200 м/с, пройдет путь, равный 3 км? (в секундах и часах) ");

        Scanner scanner = new Scanner(System.in);

        //Ввод данных
        System.out.print("Введите скорость самолета в м/с: ");
        double speed = scanner.nextDouble();

        System.out.print("Введите путь, который должен пройти самолет в км: ");
        double distanceKm = scanner.nextDouble();
        double distanceM = distanceKm * 1000; //Перевод расстояния в метры

        //Расчет времени
        double timeSeconds = distanceM / speed; //Расчет времени в секундах
        double timeHours = timeSeconds / 3600; //Расчет времени в часах

        // Вывод результатов
        System.out.printf("Время в секундах: %.2f\n", timeSeconds);
        System.out.printf("Время в часах: %.6f\n", timeHours);

        scanner.close();
    }
}
