/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Max
 */
public class Employee {
    String name;
    float salary;
    String dept;
    List<Employee> subordinates;

    public Employee(String name, float salary, String dept, List<Employee> subordinates) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
        if(subordinates!=null){
        this.subordinates = subordinates;
        }else{
        this.subordinates = new ArrayList<Employee>();
        }
    }
    
    public void add(Employee employee){
        subordinates.add(employee);
    }
    
     public void remove(Employee employee){
        int index=subordinates.indexOf(employee);
        subordinates.remove(index);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }
     
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + ", dept=" + dept + ", subordinates=" + subordinates.size() + '}';
    }
     
}
