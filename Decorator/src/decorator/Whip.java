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
public class Whip extends CodimentDecorator {
    Beverage beverage;
    
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription()+", Whip";
    }
    public double cost(){
        return .10+beverage.cost();
    }
}
