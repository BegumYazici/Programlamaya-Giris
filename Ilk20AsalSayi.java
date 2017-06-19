package com.example24;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus1 on 19.6.2017.
 */
public class asalSayi {

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
                    return;
                }
         }
    }
}

