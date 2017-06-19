package com.example24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by asus1 on 19.6.2017.
 */
public class asalSayi2 {

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();

            int sayi;
            for(int i=2; i<=100; i++){
                sayi=0;
                for(int j=2; j<i; j++){
                    if(i%j==0) sayi++;
                }

                if(liste.size()<20){
                    if(sayi==0) {
                        System.out.print(+i+" ");
                        liste.add(i);
                    }
                }else{
                    break;
                }
         }

        System.out.println();
        indexBulucu(liste);
    }

    public static void indexBulucu(List<Integer> list){

        System.out.print("Kacinci indeksli elemani istiyorsunuz: ");
        Scanner giris = new Scanner(System.in);
        int index=giris.nextInt();

        System.out.println("f(" + index + "): " + list.get(index));
    }
}
