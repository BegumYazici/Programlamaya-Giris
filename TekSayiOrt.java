package Examples;
/**
 * Created by asus1 on 20.6.2017.
 */
public class examp7 {

    public static void main(String[] args) {

        int dizi[] = {2,4,3,7,98,5,4};
        int toplam=0, ortalama=0;
        int sayac=0;

        for(int i=0; i<dizi.length; i++){
            if(dizi[i]%2 !=0){
                toplam += dizi[i];
                sayac++;
            }
        }
        System.out.println("Ortalama: "+ (toplam / sayac));
    }
}
