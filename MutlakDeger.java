package Examples;

/**
 * Created by asus1 on 19.6.2017.
 */
public class examp3 {

    public static void main(String[] args) {

        int [] array= {-2,5,7,-8,2,-19};

        for(int i=0; i<array.length; i++){
            if(array[i]<0){
                array[i] = array[i] * (-1);
            }
        }
        int toplam = 0;

        for(int k : array){
            System.out.print(k+ " ");
            toplam += k;
        }

        System.out.println();
        System.out.println(toplam);
    }
}
