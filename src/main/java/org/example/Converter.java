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
            case 3:
                System.out.println("1. Вершок\n" +
                        "2. Пядь\n" +
                        "3. Локоть\n" +
                        "4. Косая сажень\n" +
                        "5. Маховая сажень\n" +
                        "6. Фут\n" +
                        "7. Дюйм\n" +
                        "8. Сажень\n" +
                        "9. Ярд\n" +
                        "10. Верста\n" +
                        "11. Аршин");
                unit = scanner.nextInt();
                System.out.println("Ответ: " + oldRussian(unit, value));
                break;
            case 4:
                System.out.println("1. Палец\n" +
                        "2. Фут\n" +
                        "3. Пальм\n" +
                        "4. Акт\n" +
                        "5. Локоть");
                unit = scanner.nextInt();
                System.out.println("Ответ: " + roman(unit, value.doubleValue()) + " м.");
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

    public static BigDecimal oldRussian(int unit, BigDecimal value){
        BigDecimal ans = BigDecimal.valueOf(0.0);
        switch (unit){
            case 1:
                ans = BigDecimal.valueOf(0.0445).multiply(value);
                break;
            case 2:
                ans = BigDecimal.valueOf(0.0445 * 4).multiply(value);
                break;
            case 3:
                ans = BigDecimal.valueOf(0.45).multiply(value);
                break;
            case 4:
                ans = BigDecimal.valueOf(2.48).multiply(value);
                break;
            case 5:
                ans = BigDecimal.valueOf(1.76).multiply(value);
                break;
            case 6:
                ans = BigDecimal.valueOf(0.31).multiply(value);
                break;
            case 7:
                ans = BigDecimal.valueOf(0.025).multiply(value);
                break;
            case 8:
                ans = BigDecimal.valueOf(2.13).multiply(value);
                break;
            case 9:
                ans = BigDecimal.valueOf(0.91).multiply(value);
                break;
            case 10:
                ans = BigDecimal.valueOf(1067).multiply(value);
                break;
            case 11:
                ans = BigDecimal.valueOf(0.71).multiply(value);
                break;
            default:
                System.out.println("Неверные данные");
                return BigDecimal.valueOf(0);
        }
        return ans;
    }
    public static double roman(int unit, double value) {
        double answer = 0;
        switch (unit) {
            case 1:
                answer = value / 100 * 1.85;
                break;
            case 2:
                answer = value / 100 * 29.57;
                break;
            case 3:
                answer = value / 100 * 7.39;
                break;
            case 4:
                answer = value *35.5;
                break;
            case 5:
                answer = value / 100 * 44.4;
                break;
            default:
                System.out.println("Неверные данные");
                return 0;
        }
        return answer;
    }

    public static double english(int unit, double value) {
        double answer = 0;
        switch (unit) {
            case 1:
                answer = value / 100 * 2.5;
                break;
            case 2:
                answer = value / 100 * 30.5;
                break;
            case 3:
                answer = value * 0.9;
                break;
            case 4:
                answer = value * 1600;
                break;
            default:
                System.out.println("Неверные данные");
                return 0;
        }
        return answer;
    }
}