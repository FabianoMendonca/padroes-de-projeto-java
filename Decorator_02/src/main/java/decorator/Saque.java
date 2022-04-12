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
public class Saque extends Adicionais{
    Drinks drinks;
    
    public Saque(Drinks drink){
        this.drinks = drink;
    }
    public String getDescription(){
        return drinks.getDescription() + ", Saque";
    }
    public double cost(){
        if (drinks.getSize()) return 4.0 + drinks.cost();
        else return 6.50 + drinks.cost();
    }
    
}