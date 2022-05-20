package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateMethod {
    public static void main(String[]args){
        Map<String,Integer> Data=new HashMap<String, Integer>();
        Data.put("Abhishe",1);
        Data.put("Harhit",2);
        Data.put("Harshit",40);

        Iterator<Map.Entry<String, Integer>> itr =Data.entrySet().iterator();
         while (itr.hasNext()) {

             Map.Entry<String, Integer> entry=itr.next();
         System.out.println("Key="+entry.getKey()+","+"Value="+entry.getValue());

         }   }

}
