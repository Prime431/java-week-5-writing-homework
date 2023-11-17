package programme2to11;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Jay Vaghani
 */

public class Programme_5_ArrayListWithIterator {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("APPLE");
        fruitList.add("BANANA");
        fruitList.add("GRAPE");
        fruitList.add("MANGO");
        fruitList.add("KIWI");
        fruitList.add("ORANGE");
        fruitList.add("BLACKBERRY");
        fruitList.add("STRAWBERRY");
        fruitList.add("CHERRY");

        ListIterator<String> iterator = fruitList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + ",  ");
        }

    }
}
