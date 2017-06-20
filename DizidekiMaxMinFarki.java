package Examples;

import java.util.ArrayList;

/**
 * Created by asus1 on 20.6.2017.
 */
public class examp5 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(9);
        list.add(2);
        list.add(11);
        list.add(-7);

        int max=0, min=1000;

        for(int i=0; i<list.size(); i++){
            if(list.get(i)> max){
                max=list.get(i);
            }
        }

        System.out.println("Max degeri: "+ max);


        for(int j=0; j<list.size(); j++){
            if(list.get(j)< min){
                min = list.get(j);
            }
        }

        System.out.println("Min degeri: "+ min);
        System.out.println("Max - min degeri: "+ (max-min));
    }
}
