package advancejava;

import java.util.HashMap;

public class Map2 {
    public static void main(String[]args){
        HashMap<String,String> cities= new HashMap<String, String>();
        cities.put("London","England");
        cities.put("Germany", " Berlin");
        cities.put("Delhi","Agra");
       //cities.remove("Delhi");
       // cities.clear();
        //cities.size
        //cities.get
       // for (String i:cities.keySet()) {
       // System.out.println("List is "+"="+i);
        for (String i:cities.keySet()) {
            System.out.println("KEY :"+i+ ","+"VAlUE:"+cities.get(i));
        }
        }    }

