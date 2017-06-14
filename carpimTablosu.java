package com.example24;

import java.util.Scanner;

/**
 * Created by asus1 on 14.6.2017.
 */
public class CarpimTablosu {

    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz:");
        int satir=giris.nextInt();
        System.out.println("Sutun sayisini giriniz:");
        int sutun=giris.nextInt();

        int [][] carpimTablosu = new int[satir][sutun];

        System.out.println("---Carpim Tablomuz---");
        for(int i=1; i<=satir; i++){
            for(int j=1; j<=sutun; j++){
                carpimTablosu[i-1][j-1]= i*j;
                System.out.print(carpimTablosu[i-1][j-1]+" ");
            }
            System.out.println();
        }
    }
}
