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
public class CompareHondaByYear implements Comparator<Honda>{

    @Override
    public int compare(Honda car1, Honda car2) {
        int equality;
        if (car1.getYear() < car2.getYear()){
            equality = -1;
        }
        else if (car1.getYear() > car2.getYear()){
            equality = 1;
        }
        else {
            equality = 0;
        }
        return equality;
    }

}
