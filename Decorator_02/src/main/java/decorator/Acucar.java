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
public class Acucar extends Adicionais{
    Drinks drinks;
    
    public Acucar(Drinks drink){
        this.drinks = drink;
    }
    public String getDescription(){
        return drinks.getDescription() + ", Açucar";
    }
    public double cost(){
        if (drinks.getSize()) return .65 + drinks.cost();
        else return 1.0 + drinks.cost();
    }
    
}