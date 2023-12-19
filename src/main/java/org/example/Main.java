package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sayi1;
        System.out.println("Lütfen bir sayı giriniz:");
        if (scanner.hasNextInt()) {
            sayi1 = scanner.nextInt();
        } else {
            System.out.println("Lütfen geçerli bir tamsayı giriniz!");
            return;
        }
        int sayi2;
        System.out.println("Lütfen 2. sayıyı giriniz:");
        if (scanner.hasNextInt()){
            sayi2 = scanner.nextInt();
        } else {
            System.out.println("Lütfen geçerli bir tamsayı giriniz!");
            return;
        }

        int islem;
        System.out.println("Hangi işlemi yapmak istiyorsunuz?: No:1 = Toplama , No:2 = Çıkartma, No:3 = Çarpma, No:4 = Bölme " + "----- Lütfen yapmak istediğiniz işlem için bir no giriniz: Örneğin: 3");
        islem = scanner.nextInt();

            if (islem==1){
                System.out.println(sayi1+sayi2);
            } else if(islem ==2){
                System.out.println(sayi1-sayi2);
            } else if (islem == 3) {
                System.out.println(sayi1*sayi2);
            } else if (islem == 4) {
                if (sayi2==0){
                    System.out.println("Bir sayı sıfıra bölünemez!");
                } else if (sayi2>sayi1); {
                    System.out.println("2.sayı, 1.sayıdan büyük olduğu için bölünemez");
                }
            } else {
                System.out.println("Yanlış işlem girdiniz!!");
            }
    }
    }