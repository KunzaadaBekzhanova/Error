package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите квадрат любого числа: ");
            int n = scanner.nextInt();
            int squareRoot = (int) Math.sqrt(n);
            if (n == (squareRoot * squareRoot)) {
                System.out.println(n+" является квадратом "+squareRoot);
            } else {
                System.out.println(n+" не является квадратом "+squareRoot);
                throw new Error();
            }
        }
    }
}
