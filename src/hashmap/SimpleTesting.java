package hashmap;

import java.util.HashMap;
import java.util.Map;

public class SimpleTesting {

    public static void main(String[]args){

        Map<Integer,String> map =new HashMap<>();
        map.put(10,"Ten");
        map.put(100,"Hundred");
        map.put(1000,"Thousand");

        for (Integer key : map.keySet()){
            System.out.println(key+"="+map.get(key));

        }
    }


}
