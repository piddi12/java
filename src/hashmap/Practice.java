package hashmap;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        Map<Integer, String> coursedata= new HashMap<>();
        coursedata.put(1,"java");
        coursedata.put(2,"java8");
        coursedata.put(3,"spring");
        coursedata.put(4,"boot");
        coursedata.put(5,"Orm");

        Iterator<Map.Entry<Integer, String>> iterator =coursedata.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }

}
