/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author mendo
 */
public abstract class Beverage {
    
    public String Description = "Unknow description";
        
    public abstract double cost();
    public String getDescription(){
        
        return Description;
    }
}
