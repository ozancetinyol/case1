package org.example;

public class Calculation {

    public int addition(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public int subtraction(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

    public int multiplication(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    public int division(int sayi1, int sayi2) {
        if (sayi2 == 0) {
            System.out.println("Bir sayı sıfıra bölünemez!");
        } else if (sayi1 == 0) {
            System.out.println("0");
        } else if (sayi2 > sayi1) {
            System.out.println("2.sayı, 1.sayıdan büyük olduğu için bölünemez.");
        } else {
            System.out.println(sayi1 / sayi2);
        }
        return sayi2;
    }
}

