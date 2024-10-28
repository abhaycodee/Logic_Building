package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {

    private int eid;
    private String name;
    private int salary;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int eid, String name, int salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    // Inner Comparator class to sort by salary
    static class SalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Integer.compare(e1.getSalary(), e2.getSalary());
        }
    }

}
public class Comparator1 {
    public static void main(String[] args) {


        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"abhay",12050));
        list.add(new Employee(2,"ankit",15700));
        list.add(new Employee(3,"maxi",19200));
        list.add(new Employee(4,"kafe",22300));
        list.add(new Employee(5,"lostimer",34050));
        list.add(new Employee(6,"lucifer",67450));
        list.add(new Employee(7,"ganster",45050));

        Collections.sort(list,new Employee.SalaryComparator());
        System.out.println(list);

    }
}
