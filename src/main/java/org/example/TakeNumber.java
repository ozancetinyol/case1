package org.example;

import java.util.Scanner;

public class TakeNumber {

    Scanner scanner = new Scanner(System.in);

    public int firstNum() {
        int num1;
        System.out.println("Lütfen bir sayı giriniz:");
        if (scanner.hasNextInt()) {
            num1 = scanner.nextInt();
        } else {
            System.out.println("Lütfen geçerli bir tamsayı giriniz!");
            scanner.hasNextInt();
            System.exit(0);
            return 0;
        }
        return num1;

    }

    public int secondNum() {
        int num2;
        System.out.println("Lütfen 2. sayıyı giriniz:");
        if (scanner.hasNextInt()) {
            num2 = scanner.nextInt();
        } else {
            System.out.println("Lütfen geçerli bir tamsayı giriniz!");
            System.exit(0);
            return 0;
        }
        return num2;

    }

}