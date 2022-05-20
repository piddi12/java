package model;

public class Student {
    String name;
    String branch;
    int rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public Student(String name, String branch, int rollno) {
        this.name = name;
        this.branch = branch;
        this.rollno = rollno;
    }
}
