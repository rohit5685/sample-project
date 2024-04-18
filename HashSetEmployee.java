package Collections;

import java.util.HashSet;
import java.util.Objects;

public class HashSetEmployee {
    private int id;
    private String name;
    private long salary;
    private String department;

    public HashSetEmployee(int id, String name, long salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "HashSetEmployee{" +
                "Employee id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        HashSetEmployee employee = (HashSetEmployee) o;
        if (employee.id == this.id) {
            employee.setName(this.name);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    public static void main(String[] args) {
        HashSet<HashSetEmployee> he=new HashSet<>();
        he.add(new HashSetEmployee(101,"Rohit",10000,"IT"));
        he.add(new HashSetEmployee(101,"vijay",5000,"CSE"));
        he.add(new HashSetEmployee(102,"Vijay",6000,"ME"));
        System.out.println(he);
    }


}
