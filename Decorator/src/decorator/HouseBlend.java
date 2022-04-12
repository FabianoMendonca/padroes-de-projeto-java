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
public class HouseBlend extends Beverage {
    
    public HouseBlend (){
        Description = "House Blend Coffe";
    }
    public double cost(){
        return (0.89);
    }
    
}
