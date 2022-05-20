package advancejava;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[]args){
        LinkedList<String> nameslist =new LinkedList<>();
        nameslist.add("sanddy");
        nameslist.add("raj");
        nameslist.add("kalu");
        nameslist.add("mohit");
        nameslist.add("dev");
      //  nameslist.remove("dev");
       //// for (String var :nameslist){
           // System.out.println("name is "+var);
       //nameslist.get(1);
        Collections.sort(nameslist);
       System.out.println(nameslist);

        }


    }



