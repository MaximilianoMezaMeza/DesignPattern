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
public class AddCriteria implements Criteria{
    
    private Criteria criteria;
    private Criteria otherCriteria;

    public AddCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
    

    @Override
    public List<Person> meetCriteria(List<Person> people) {
         List<Person> people1=criteria.meetCriteria(people);
        return otherCriteria.meetCriteria(people1);
    }
    
}
