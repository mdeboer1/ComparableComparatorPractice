/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparablecomparatorpractice;

import java.util.Objects;

/**
 *
 * @author mdeboer1
 */
public class Honda implements Car, Comparable<Honda>{
    private String model;
    private int year;
    private String vin;
    
    public Honda(String model, int year, String vin){
        setModel(model);
        setYear(year);
        setVin(vin);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.vin);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Honda other = (Honda) obj;
        if (!Objects.equals(this.vin, other.vin)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Honda{" + "model=" + model + ", year=" + year + ", vin=" + vin + '}';
    }
    
    public final void setModel(String model) {
        this.model = model;
    }

    public final void setYear(int year) {
        this.year = year;
    }

    public final void setVin(String vin) {
       this.vin = vin;
    }

    public final String getModel() {
        return model;
    }

    public final int getYear() {
        return year;
    }

    public final String getVin() {
        return vin;
    }

    @Override
    public int compareTo(Honda c) {
        if (c == null){
            throw new NullPointerException("No nulls");
        }
    return this.vin.compareTo(c.getVin());
    }

    @Override
    public String getDescription() {
       return this.getYear() + " " + this.getModel() + " has:";
    }
}
