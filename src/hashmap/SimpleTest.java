package hashmap;

import java.util.HashMap;
import java.util.Map;

public class SimpleTest {

    public static void main(String[]args){
        Map<Integer,String> Data= new HashMap<>();
        Data.put(1,"Mixture");
        Data.put(2,"sev");
        Data.put(3,"Dalmoth");
        Data.put(4,"Dalsev");

        Data.entrySet().forEach(integerStringEntry -> {
            System.out.println(integerStringEntry.getKey()+"="+integerStringEntry.getValue());

        });




    }

    }
