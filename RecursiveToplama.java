package Examples;

/**
 * Created by asus1 on 19.6.2017.
 */
public class examp2 {

    public static void main(String[] args) {

        System.out.println(f(4,4));
    }

     static int f(int sayi,int n){
        if(n==1){
            return sayi;
        }
        return sayi + f(sayi,(n-1));
    }
}
