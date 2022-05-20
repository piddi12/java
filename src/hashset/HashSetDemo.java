package hashset;

import java.util.HashSet;

public class HashSetDemo {

    public HashSet<String> createhashset(){

        HashSet<String>COURSE=new HashSet<>();
        COURSE.add("JAVA");
        COURSE.add("JAVA");
        COURSE.add("Spring");

        return COURSE;
    }
    public static void main(String[]args){
        HashSetDemo obj= new HashSetDemo();
        HashSet<String>Course=obj.createhashset();
        for (String var:Course){
            System.out.println("LIST OD COURSE IS "+"="+var);
        }
    }
}
