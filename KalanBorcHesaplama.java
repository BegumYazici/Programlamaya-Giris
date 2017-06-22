package Examples;
import java.util.Scanner;

/**
 * Created by asus1 on 22.6.2017.
 */
public class examp9 {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        System.out.print("Aylik odenecek tutari giriniz: ");
        int miktar=giris.nextInt();
        int toplamBorc = miktar * 36;
        System.out.println();
        System.out.print("Kacinci taksiti odeyeceksiniz?");
        int n2=giris.nextInt();

        examp9 obj = new examp9();
        int sonuc=obj.kalanBorc(toplamBorc,n2,miktar);
        System.out.println("KalanBorc: "+sonuc);
    }

    private int kalanBorc(int toplamBorc, int n, int miktar){

        int odenenTutar = n * miktar;
        int kalanBorc = toplamBorc - odenenTutar;

        return kalanBorc;
    }
}
