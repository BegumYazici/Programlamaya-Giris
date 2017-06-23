package Examples;

import java.util.Scanner;

/**
 * Created by asus1 on 23.6.2017.
 */
public class examp11{
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi=giris.nextInt();

        while(sayi<=1){
            sayi=0;
            System.out.print("Sayi 1'den kucuk olamaz! Yeni sayi giriniz: ");
            sayi=giris.nextInt();
        }

        int toplam=0;

        for(int i=1; i<sayi; i++){
            toplam += (i*i);
        }

        System.out.println("1-"+sayi+" arasi sayilarin karelerinin toplami: "+toplam);
    }
}
