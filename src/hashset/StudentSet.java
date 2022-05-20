package hashset;

import model.Student;

import java.util.HashSet;

public class StudentSet {

    public HashSet<Student> createstudentset(){
        HashSet<Student> studentdata= new HashSet<>();
        Student student1=new Student("simmi","me",15);
        Student student2=new Student("raj","cs",52);

        studentdata.add(student1);
        studentdata.add(student2);
        return studentdata;
    }
    public static void main(String[]args){
       StudentSet obj =new StudentSet();
       HashSet<Student>studentHashSet=obj.createstudentset();
       for (Student var:studentHashSet){
           System.out.println("Your Student is"+"="+var.getName()+","+var.getBranch());
       }
    }




}
