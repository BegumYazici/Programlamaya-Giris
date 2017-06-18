package com.example24;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by asus1 on 18.6.2017.
 */
public class examp {

    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz: ");
        int boyut = giris.nextInt();
        int[] sayiDizisi = new int[boyut];

        for (int i = 0; i < boyut; i++) {
            System.out.print((i + 1) + ". degeri giriniz: ");
            sayiDizisi[i] = giris.nextInt();
        }

        System.out.print("Sayilar: ");
        for (int x : sayiDizisi) {
            System.out.print(x + ",");
        }
        System.out.println();
        examp obj = new examp();
        
        int [] temp =obj.kareAl(sayiDizisi);
        int ort=obj.ortAl(temp);
        obj.kareKok(ort);
    }

    public int[] kareAl(int [] dizi){

        int [] kareAldizi = new int[dizi.length];

        for(int i=0; i<dizi.length; i++){
            kareAldizi[i]= (int)Math.pow(dizi[i],2);
        }

        System.out.print("Kareleri: ");
        for(int y : kareAldizi){
            System.out.print(y + ",");
        }
        return kareAldizi;
    }

    public int ortAl(int [] dizi2){

        int toplam=0;
        for(int i=0; i<dizi2.length; i++){
            toplam +=dizi2[i];
        }

        int ortalama = (toplam)/(dizi2.length);
        System.out.println();
        System.out.println("Ortalama : "+ ortalama);

        return ortalama;
    }

    public void kareKok(int c){

        double kareKok = (double) Math.sqrt(c);
        String x =  new DecimalFormat("##.##").format(kareKok);
        System.out.println("Karekoku kok("+c+ "):" + x);
    }
}
