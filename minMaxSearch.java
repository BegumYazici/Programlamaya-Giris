package com.example24;

import java.util.Scanner;

public class example1 {

    public static void main(String[] args) {

        example1 obj = new example1();
        obj.maxMinBul();
    }

    public void maxMinBul(){

        Scanner giris = new Scanner(System.in);
        System.out.println("1. sayiyi giriniz:");
        int x =giris.nextInt();
        System.out.println("2. sayiyi giriniz:");
        int y =giris.nextInt();
        System.out.println("3. sayiyi giriniz:");
        int z =giris.nextInt();
        int max=0, min=0;

        if(x>z){
            if(x>y){
                max=x;
            }else{
                max=y;
            }

        } else{
            if(z>y){
                max=z;
            }else{
                max=y;
            }
        }

        if(x<z){
            if(x<y){
                min=x;
            }else{
                min=y;
            }

        } else{
            if(z<y){
                min=z;
            }else{
                min=y;
            }
        }
        
        System.out.println("min sayi: "+min);
        System.out.println("max sayi: "+max);
    }
}
