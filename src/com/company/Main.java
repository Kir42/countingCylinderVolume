package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double PI = 3.14;
        double h;
        double r;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("введите высоту: ");
            try {
                h = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }

        while (true) {
            System.out.println("введите радиус: ");
            try {
                r = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
        System.out.println("ответ: " + PI * (r * r) * h);

    }
}

