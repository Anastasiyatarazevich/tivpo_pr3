package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привествуем вас в самом лучшем конвертере All in meters, который переводит всё в метры!!!");
        System.out.println("Введите номер системы единиц из которой вы хотите перевести величину \n" +
                "1. СИ \n" +
                "2. Английская \n" +
                "3. Древнерусская \n" +
                "4. Римская");
        int system = scanner.nextInt();
        System.out.println("Введите значение, которое хотите перевести");
        BigDecimal value = scanner.nextBigDecimal();

        System.out.println("Введите номер единицы измерения, из которой вы хотите перевести");
        int unit;
        switch (system) {
            case 1:
                System.out.println("1. Сантиметр\n" +
                        "2. Дециметр\n" +
                        "3. Километр");
                unit = scanner.nextInt();
                System.out.println("Ответ: " + si(unit, value.doubleValue()) + " м.");
                break;

            default:
                System.out.println("Неверное значение");
        }
    }

    public static double si(int unit, double value) {
        double answer = 0;
        switch (unit) {
            case 1:
                answer = value / 100;
                break;
            case 2:
                answer = value / 10;
                break;
            case 3:
                answer = value * 1000;
                break;
        }
        return answer;
    }

}