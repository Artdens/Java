/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Auto {
    
    private String manufacture;
    private String model;
    private int motorCapacity;
    private typeFuel fuel;
    private LocalDate year = LocalDate.now();
    
    public Auto(String manufacture, String model, LocalDate year, int motorCapacity, typeFuel fuel){
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
        this.motorCapacity = motorCapacity;
        this.fuel = fuel;
    }
    
    public String getModel(){
        return this.model;
    }
    
    public int getYear(){
        return this.year.getYear();
    }
    
    public int getMotorCapacity(){
        return this.motorCapacity;
    }
    
    public typeFuel getFuel(){
        return this.fuel;
    }
    
    public String toString(){
        return this.manufacture+"/"+this.model+"/"+this.year+"/"+this.motorCapacity+"/"+this.fuel;
    }
    
}
