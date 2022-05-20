package hashmap;
import java.util.HashMap;
public class Employee {

    public static void main(String[]args){
        HashMap<String,Integer> empdata= new HashMap<>();
        empdata.put("Sandeep",4114);
        empdata.put("Rajat",41141);
        empdata.put("Raj",56244);
        empdata.put("Sonu",52525);

       // System.out.println(empdata);
       // System.out.println(empdata.get("Raj"));
        //System.out.println(empdata.containsKey("Sandeep"));
        //empdata.put("Raj",451415);
        //System.out.println(empdata);
      for (String var: empdata.keySet());
      System.out.println("empname is "+empdata.keySet());

    }

}
