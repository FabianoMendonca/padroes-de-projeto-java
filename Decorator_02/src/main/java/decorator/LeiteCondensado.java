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
public class LeiteCondensado extends Adicionais{
    Drinks drinks;
    
    public LeiteCondensado(Drinks drink){
        this.drinks = drink;
    }
    public String getDescription(){
        return drinks.getDescription() + ", LeiteCondensado";
    }
    public double cost(){
        if (drinks.getSize()) return 1.30 + drinks.cost();
        else return 2.00 + drinks.cost();
    }
    
}