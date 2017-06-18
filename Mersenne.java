package com.example24;
/**
 * Created by asus1 on 18.6.2017.
 */
public class examp {

    public static void main(String[] args) {

        int [] dizi = new int[20];

        for(int i=0; i<20; i++){

            dizi[i]= (int)( Math.pow(2,(i+1))) -1;
        }

        for(int k: dizi){
            System.out.print(k + " ");
        }
    }
}
