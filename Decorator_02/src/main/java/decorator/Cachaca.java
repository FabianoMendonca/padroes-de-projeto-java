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
public class Cachaca extends Adicionais{
    Drinks drinks;
    
    public Cachaca(Drinks drink){
        this.drinks = drink;
    }
    public String getDescription(){
        return drinks.getDescription() + ", Cachaça";
    }
    public double cost(){
        if (drinks.getSize()) return 3.00 + drinks.cost();
        else return 5.00 + drinks.cost();
    }
    
}