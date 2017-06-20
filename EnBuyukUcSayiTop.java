package Examples;

import java.util.ArrayList;

/**
 * Created by asus1 on 20.6.2017.
 */
public class examp4 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> addList = new ArrayList<>();

        list.add(5);
        list.add(9);
        list.add(2);
        list.add(11);
        list.add(-7);

        int max=0, max2=0, max3=0;
        int index=0, index2=0, index3=0;

        for(int i=0; i<list.size(); i++){
            if(list.get(i)> max){
                max= list.get(i);
                index = i;
            }
        }

        addList.add(max);
        list.remove(index);
        for(int i=0; i<list.size(); i++){
            if(list.get(i)> max2){
                max2= list.get(i);
                index2 = i;
            }
        }

        addList.add(max2);
        list.remove(index2);

        for(int i=0; i<list.size(); i++){
            if(list.get(i)> max3){
                max3= list.get(i);
                index3 = i;
            }
        }

        addList.add(max3);
        list.remove(index3);

        System.out.println(addList);
        int sum=0;

        for(int k=0; k<addList.size(); k++){
            sum +=addList.get(k);
        }

        System.out.println("Listedeki en buyuk 3 degerin toplami: "+ sum);
    }
}
