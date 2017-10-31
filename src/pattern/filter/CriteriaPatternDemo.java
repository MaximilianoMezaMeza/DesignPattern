/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Max
 */
public class CriteriaPatternDemo {
    public static void main(String [] argv){
        List<Person> people=new ArrayList<Person>();
        people.add(new Person("Maria","Famale","Single"));
        people.add(new Person("Pedro","Male","Single"));
        people.add(new Person("Julia","Famale","Married"));
        people.add(new Person("Juan","Male","Single"));
        people.add(new Person("Elisa","Famale","Single"));
        people.add(new Person("Diego","Male","Married"));
        people.add(new Person("Fabro","Homosexual","Single"));
        
        CriteriaFamale criteriaFamale=new CriteriaFamale();
        CriteriaMale criteriaMale=new CriteriaMale();
        SingleCriteria singleCriteria=new SingleCriteria();
        
        AddCriteria addCriteria=new AddCriteria(criteriaFamale, criteriaMale);
        
        AddCriteria addCriteria2=new AddCriteria(singleCriteria, criteriaMale);
        
        OrCriteria orCriteria=new OrCriteria(criteriaFamale, criteriaMale);
        
        OrCriteria orCriteria2=new OrCriteria(criteriaFamale, singleCriteria);
        
        printPerson(addCriteria.meetCriteria(people)," Famale, Male");
        printPerson(addCriteria2.meetCriteria(people)," Single, Male");
        printPerson(orCriteria.meetCriteria(people)," Famale, Male");
        printPerson(orCriteria2.meetCriteria(people)," Famale, Single");
        
    }
    
    public static void printPerson(List<Person> people, String criteria){
         System.out.println("\nCriteria: "+criteria);
        for(int i=0;i<people.size();i++){
            System.out.println(people.get(i));
        }
    }
}
