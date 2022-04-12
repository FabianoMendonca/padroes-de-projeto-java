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
public class Mojito extends Drinks{
    
    public Mojito(boolean size){
        if (size) description = "Mojito Pequeno";
        else description = "Mojito Grande";
        
        setSize(size);
    }
    public double cost(){
        if (size) return (7.00);
        else return (12.00);
    }
}
