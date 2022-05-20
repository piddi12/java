package arraylist;
import  java.util.ArrayList;
public class Array {
    public static void main(String[]args){

        String[] friendArray= new String[5];
        String[] friendArray2= {"SANDEEP","RAJ","AYUSH"};

        ArrayList<String> friendArraylist= new ArrayList<>();
        friendArraylist.add("lasun");
        friendArraylist.add("pur");
        friendArraylist.add(0,"Ramu");


      //  System.out.println(friendArray2);
        //System.out.println("List is "+friendArraylist);

        for (String var:friendArraylist){
            System.out.println("LIST IS "+var);
        }

    }
}
