/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparablecomparatorpractice;

import java.util.Comparator;

/**
 *
 * @author mdeboer1
 */
public class CompareHondaByModel implements Comparator<Honda>{

    @Override
    public int compare(Honda car1, Honda car2) {
        return car1.getModel().compareTo(car2.getModel());
    }
    
}
