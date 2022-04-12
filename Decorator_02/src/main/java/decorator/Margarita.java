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
public class Margarita extends Drinks {
    
    public Margarita(boolean size){
        if (size) description = "Margarita Pequeno";
        else description = "Margarita Grande";
        
        setSize(size);
    }
    public double cost(){
        if (size) return (5.00);
        else return (9.00);
    }
}