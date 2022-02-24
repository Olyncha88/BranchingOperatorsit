package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца:");
        int month = scanner.nextInt();
        String res;
        switch (month) {
            case 1:
            case 2:
            case 12:
                res = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                res = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                res = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                res = "Осень";
                break;
            default:
                res = "Такого месяца не существует!";
        }
        System.out.println(res);

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Снова введите номер месяца:");
        int month2 = scanner2.nextInt();
        String res2;
        if (month2 == 12 || month2 == 1 || month2 == 2) {
            res2 = "Зима";
            System.out.println(res2);
        } else if (month2 == 3 || month2 == 4 || month2 == 5) {
            res2 = "Весна";
            System.out.println(res2);
        } else if (month2 == 6 || month2 == 7 || month2 == 8) {
            res2 = "Лето";
            System.out.println(res2);
        } else if (month2 == 9 || month2 == 10 || month2 == 11) {
            res2 = "Осень";
            System.out.println(res2);
        } else {
            res2 = "Такого месяца не существует!";
            System.out.println(res2);
        }
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите любое число");
        int Number = scanner3.nextInt();
        if (Number % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Введите значение температуры на улице");
        int Temperature = scanner4.nextInt();
        if (Temperature > -5) {
            System.out.println("Тепло");
        } else if (Temperature > -20) {
            System.out.println("Нормально");
        } else if (-20 >= Temperature) {
            System.out.println("Холодно");
        }
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Введите любой номер цвета Радуги от 1 до 7");
        int numColor = scanner5.nextInt();
        switch (numColor) {
            case 1:
                System.out.println("Это - Красный цвет");
                break;
            case 2:
                System.out.println("Это - Оранжевый цвет");
                break;
            case 3:
                System.out.println("Это - Жёлтый цвет");
                break;
            case 4:
                System.out.println("Это - Зелёный цвет");
                break;
            case 5:
                System.out.println("Это - Голубой цвет");
                break;
            case 6:
                System.out.println("Это - Синий цвет");
                break;
            case 7:
                System.out.println("Это - Фиолетовый цвет");
                break;
            default:
                System.out.println("Такого цвета не существует!");
        }
    }
}
