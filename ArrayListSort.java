/*
 19.9 (Sort ArrayList) Write the following method that sorts an ArrayList:

public static <E extends Comparable<E>>
  void sort(ArrayList<E> list)
 */
package arraylistsort;

import java.util.ArrayList;

public class ArrayListSort {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //Create Arraylist

        for (int i = 0; i < 10; i++) { //Int For loop
            list.add(i);
        }
        System.out.println(list);
        ArrayListShuffle.shuffle(list); //Print Lists
        System.out.println(list);
        sort(list);
        System.out.println(list);

    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) { // Sort Method


        for (int i = 0; i < list.size() - 1; i++) {
            E currentMin = list.get(i);
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(j).compareTo(currentMin) < 0) {
                    currentMin = list.get(j);
                    min = j;
                }
            }

            if (min != i) {
                list.set(min, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
    
}
