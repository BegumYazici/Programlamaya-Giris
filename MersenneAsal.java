package com.example24;

import java.util.ArrayList;
/**
 * Created by asus1 on 18.6.2017.
 */
public class examp {

    public static void main(String[] args) {

        ArrayList<Integer> dizim = new ArrayList<>();
        ArrayList<Integer> asalOlmayanlar = new ArrayList<>();

        for(int i=0; i<20; i++){

            dizim.add((int)( Math.pow(2,(i+1))) -1);
        }

        System.out.println("--Ilk 20 Mersenne dizimdeki sayilar--");
        System.out.println(dizim);

        for(int i=1; i<20; i++){
            int deger=dizim.get(i);
            for(int j=2; j<dizim.get(i); j++){
                if(deger%j==0){
                  //  dizim.remove(i);  //asal degildir, listeden cıkart.
                    asalOlmayanlar.add(deger);
                    break;
                }
            }
        }

        System.out.println("--Ilk 20 Mersenne dizimden asal olmayanlar--");
        System.out.println(asalOlmayanlar);
    }
}
