/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparablecomparatorpractice;

/**
 *
 * @author mdeboer1
 */
public class LeatherSeatDecorator implements CarDecorator {
    private final String LEATHERSEATS = "leather seats";
    private Car car;
    
    public LeatherSeatDecorator(Car car){
        this.car = car;
    }
    @Override
    public String getDescription() {
        return car.getDescription() + " " + LEATHERSEATS;
    }

    
}
