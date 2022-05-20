package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {

    public static void main(String[]args){
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
      // for (String var:fruits){
        Collections.sort(fruits);
System.out.println(fruits);
}   }



