/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String args[]){
        
        List<Auto> arr = new ArrayList<>();
        
        arr.add(new Auto("Nissan", "GT-R", LocalDate.of(2003,1,1), 1600, typeFuel.diesel));
        arr.add(new Auto("Mercedes-Benz", "C199-SLR", LocalDate.of(2010,1,1), 2100, typeFuel.petrol));
        arr.add(new Auto("BMW", "M8", LocalDate.of(2016,1,1), 1300, typeFuel.petrol));
        arr.add(new Auto("Audi", "R8", LocalDate.of(2007,1,1), 900, typeFuel.diesel));
        
        arr.sort((m1, m2)->m1.getModel().compareTo(m2.getModel()));
        
        List<Auto> autoCapacity = arr.stream()
            .filter(x -> x.getMotorCapacity() > 1500).collect(Collectors.toList());
        
        List<Auto> autoYear = arr.stream()
            .filter(x -> LocalDate.now().getYear() - x.getYear() > 10).collect(Collectors.toList());
                
        Map<typeFuel,List<Auto>> groupd = arr.stream()
            .collect(Collectors.groupingBy((x) -> x.getFuel()));
        
        for(Auto i : autoCapacity){
            System.out.println(i.toString());
        }
        System.out.println("");
        for(Auto i : autoYear){
            System.out.println(i.toString());
        }
        System.out.println("");
        System.out.println(groupd);
        

        
    }
}
