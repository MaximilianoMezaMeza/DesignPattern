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
public class SingleCriteria implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> people) {
           List<Person> singlePeople=new ArrayList<Person>();
        for(int i=0;i<people.size();i++){
            if(people.get(i).getMaritalStatus().equalsIgnoreCase("single")){
                singlePeople.add(people.get(i));
                    }
        }
        return singlePeople;
    }
    
}
