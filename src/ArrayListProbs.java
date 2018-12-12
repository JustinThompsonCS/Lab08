/**
 * Created by 154424 on 12/6/2018.
 */
import java.util.*;

public class ArrayListProbs {
    public void makeListAndPrint(int num, int limit){
         ArrayList<Integer> list = new ArrayList<>(num);
         while (list.size() < num){
             list.add((int) (Math.random() * limit + 1));
         }
         System.out.println(list);
    }

    public ArrayList<Integer> minToFront(ArrayList<Integer> list){
        int min = 9999;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) min = list.get(i);
        }
        list.add(0, min);
        return list;
    }

    public ArrayList<Integer> addOne(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 1);
        }
        return list;
    }
    public ArrayList<String> removeDupes(ArrayList<String> list){
        String temp = "";
        int i = 0;
        while (i < list.size() - 1) {
            temp = list.get(i);
            if(temp.compareTo(list.get(i+1)) == 0){
                list.remove(i);
                i--;
            }
            i++;
        }
        return list;
    }
    public ArrayList<Integer> swapPairs(ArrayList<Integer> list){
        int temp = -1;
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i);
            list.set(i, list.get(i+1));
            i++;
            list.set(i, temp);
        }
        return list;
    }
    public ArrayList<String> removeLenN(ArrayList<String> list, int n){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == n){
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    public int dumbestPerson(ArrayList<Person> list){
        int dIq = 9999;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIq() < dIq) dIq = list.get(i).getIq();
        }
        return dIq;
    }
    public Book highestPricedBook(ArrayList<Book> list){
        int bookIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() > list.get(bookIndex).getPrice()) bookIndex = i;
        }
        return list.get(bookIndex);
    }
    public ArrayList<Book> banBook(ArrayList<Book> list, Book book){
        String title = book.getTitle();
        for (int i = 0; i < list.size(); i++) {
            if(title.equals(list.get(i).getTitle())) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }

}
