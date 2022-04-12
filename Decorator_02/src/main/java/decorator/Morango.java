/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author fam19
 */
public class Morango extends Adicionais{
    Drinks drinks;
    
    public Morango(Drinks drink){
        this.drinks = drink;
    }
    public String getDescription(){
        return drinks.getDescription() + ", Morango";
    }
    public double cost(){
        return 1.0 + drinks.cost();
    }
    
}