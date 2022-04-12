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
public class Limao extends Adicionais{
    Drinks drinks;
    
    public Limao(Drinks drink){
        this.drinks = drink;
    }
    public String getDescription(){
        return drinks.getDescription() + ", Limao";
    }
    public double cost(){
        return .65 + drinks.cost();
    }
}

