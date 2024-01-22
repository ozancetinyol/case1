package org.example;

import java.util.Scanner;

public class Calculator {

    TakeNumber takeNumber = new TakeNumber();
    Calculation calculation = new Calculation();

    Scanner scanner = new Scanner(System.in);

    public int calculate() {
        int a = takeNumber.firstNum();
        int b = takeNumber.secondNum();

        int process;
        System.out.println("Hangi işlemi yapmak istiyorsunuz?: No:1 = Toplama , No:2 = Çıkartma, No:3 = Çarpma, No:4 = Bölme " + "----- Lütfen yapmak istediğiniz işlem için bir no giriniz: Örneğin: 3");
        if (scanner.hasNextInt()) {
            process = scanner.nextInt();
            switch (process) {
                case 1:
                    System.out.println(calculation.addition(a, b));
                    break;
                case 2:
                    System.out.println(calculation.subtraction(a, b));
                    break;
                case 3:
                    System.out.println(calculation.multiplication(a, b));
                    break;
                case 4:
                    calculation.division(a, b);
                    break;

            }
        } else {
            System.out.println("Lütfen geçerli bir işlem giriniz!");
            System.exit(0);
            return 0;

        }
        return process;
    }

}
