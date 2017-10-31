/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.composite;

/**
 *
 * @author Max
 */
public class DemoCompositePattern {
    public static void main(String [] argv){
    
    Employee CEO = new Employee("John", 30000,"CEO",null);

      Employee headSales = new Employee("Robert", 20000.0f,"Head Sales",null);

      Employee headMarketing = new Employee("Michel", 20000,"Head Marketing",null);

      Employee clerk1 = new Employee("Laura", 10000,"Marketing",null);
      Employee clerk2 = new Employee("Bob", 10000,"Marketing",null);

      Employee salesExecutive1 = new Employee("Richard", 10000,"Sales",null);
      Employee salesExecutive2 = new Employee("Rob", 10000,"Sales",null);
      
      CEO.add(headSales);
      CEO.add(headMarketing);
      CEO.add(clerk1);
      CEO.add(clerk2);
      CEO.add(salesExecutive1);
      CEO.add(salesExecutive2);
      
      System.out.println(CEO.toString());
      
      headSales.add(salesExecutive1);
      headSales.add(salesExecutive2);
      
      System.out.println(headSales.toString());
      
      headMarketing.add(clerk1);
      headMarketing.add(clerk2);
      
      System.out.println(clerk1.toString());
      
    }
}
