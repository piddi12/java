package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSearch {

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(52);
        data.add(526);
        data.add(852);
        data.add(4512);
        data.add(1);
        data.add(45);
        //Collections.sort(data);
        boolean ans =data.contains(526);
        if (ans){
            System.out.println("this list contains 526");
        }
        else {
            System.out.println("This list is not contain 526");
        }
        System.out.println("Your Rate of Items"+data);
    }
}
