/**
 * Created by 154424 on 12/6/2018.
 */
import java.util.*;

public class ArrayListProbs {
    public void makeListAndPrint(int num, int limit){
         ArrayList<Integer> list = new ArrayList<>(num);
         for (int i = 0; i < list.size(); i++){
             list.set(i, ((int) Math.random() * limit + 1))
         }
         System.out.println(list);
    }

}
