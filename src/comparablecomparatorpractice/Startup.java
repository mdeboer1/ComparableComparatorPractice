/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparablecomparatorpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


/**
 *
 * @author mdeboer1
 */
public class Startup {
    public static void main(String[] args) {
        Car car1 = new Honda("CRV", 2013, "00001");
        Car car2 = new Honda("Pilot", 2013, "00002");
        Car car3 = new Honda("Pilot", 2013, "00003");
        Car car4 = new Honda("Pilot", 2013, "00002");
        
        List<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        
        for (Car c : list){
            System.out.println(c);
        }
        
        Set<Car> set = new LinkedHashSet<>(list);
        
        for (Car c : set){
            System.out.println(c);
        }
        
        Car decoratedCar = new Honda("Ridgeline", 2010, "00006");
        System.out.println(decoratedCar.getDescription());
        decoratedCar = new LeatherSeatDecorator(decoratedCar);
        System.out.println(decoratedCar.getDescription());
        decoratedCar = new RunningBoardDecorator(decoratedCar);
        System.out.println(decoratedCar.getDescription());
    }
    
}
