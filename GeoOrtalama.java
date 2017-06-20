package Examples;

import java.util.Scanner;

/**
 * Created by asus1 on 20.6.2017.
 */
public class examp6 {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        System.out.print("Dizimizin eleman saysini giriniz: ");
        int n=giris.nextInt();
        int [] dizi = new int [n];

        for(int i=0; i<dizi.length; i++){
            System.out.print("Dizinin" + (i+1) + ". elemanini giriniz :");
            dizi[i]=giris.nextInt();
        }
        int carpim=1;

        for(int k=0; k<dizi.length; k++){
            carpim = carpim * dizi[k];
        }

        System.out.println("Geo ortalamasi: "+ Math.pow(carpim,(1.0/n)));
    }
}
