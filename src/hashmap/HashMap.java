package hashmap;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new java.util.HashMap<>();
        map.put("SANDEEP", 1);
        map.put("Harshit", 2);
        map.put("Sandeep", 3);

        System.out.println("Your Table is"+ map);
          }
}