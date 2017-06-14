package com.example24;

import java.util.Scanner;

/**
 * Created by asus1 on 14.6.2017.
 */
public class Tarih {

    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        char c='.';
        System.out.print("Lutfen gunu giriniz:");
        int gun=giris.nextInt();
        if(gun<0 || gun>32){
            System.out.println("Gecerli bir gun araligi degildir!");
            return;
        }
        System.out.print("Lutfen ayi giriniz:");
        int ay=giris.nextInt();
        if(ay<0 || ay>13){
            System.out.println("Gecerli bir ay araligi degildir!");
            return;
        }
        System.out.print("Lutfen yili giriniz:");
        int yil=giris.nextInt();
        if(yil<0) {
            System.out.println("Yil 0'dan kucuk olamaz!");
            return;
        }

        StringBuilder sb= new StringBuilder();
        sb.append(gun);
        sb.append(c);
        sb.append(ay);
        sb.append(c);
        sb.append(yil);

        System.out.println("Gun ay yil:" + sb.toString());

        StringBuilder sb2= new StringBuilder();
        sb2.append(ay);
        sb2.append(c);
        sb2.append(gun);
        sb2.append(c);
        sb2.append(yil);

        System.out.println("Ay gun yil:" + sb2.toString());

        StringBuilder sb3= new StringBuilder();
        sb3.append(yil);
        sb3.append(c);
        sb3.append(ay);
        sb3.append(c);
        sb3.append(gun);

        System.out.println("Yil ay gun:" + sb3.toString());
    }
}
