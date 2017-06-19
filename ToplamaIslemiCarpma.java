package Examples;

import java.util.Scanner;

/**
 * Created by asus1 on 19.6.2017.
 */
public class examp1 {

    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        System.out.print("Sayiyi giriniz: ");
        int sayi=giris.nextInt();
        System.out.print("n: ");
        int n=giris.nextInt();

        examp1 obj = new examp1();
        int sonuc=obj.f(sayi,n);
        System.out.println("Sonuc: "+sonuc);

    }

    public int f(int sayi, int n){

        int sonuc=0;

        for(int i=0; i<n; i++){

            sonuc += sayi;
        }
        return sonuc;
    }
}
