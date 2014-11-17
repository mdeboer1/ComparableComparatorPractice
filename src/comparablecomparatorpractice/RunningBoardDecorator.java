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
public class RunningBoardDecorator implements CarDecorator {
    private final String RUNNINGBOARDS = "running boards";
    private Car car;

    public RunningBoardDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + " " + RUNNINGBOARDS;
    }
    
}
