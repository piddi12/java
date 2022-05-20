package model;

public class Employee {
    String name;
    String branch;
    int empid;

    public String getName() {
        return name;
    }

    public Employee(String name, String branch, int empid) {
        this.name = name;
        this.branch = branch;
        this.empid = empid;
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

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }
}
