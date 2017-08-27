package Examples;

import java.util.Scanner;

/**
 * Created by asus1 on 27.8.2017.
 */
public class examp16 {

    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        System.out.print("İsmi girin: ");
        String isim =giris.nextLine();

       String[] dizim=isim.split(" ");

        for(int i=0; i<dizim.length; i++){
            System.out.println(dizim[i]);
        }
        for(int i=0; i<dizim.length; i++){
            System.out.println(dizim[i].charAt(0));
        }
    }
}
