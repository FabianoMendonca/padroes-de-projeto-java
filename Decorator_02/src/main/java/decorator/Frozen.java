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
public class Frozen extends Drinks{
    
    public Frozen(boolean size){
        if (size) description = "Frozen Pequeno";
        else description = "Frozen Grande";
        
        setSize(size);
    }
    public double cost(){
        if (size) return (4.00);
        else return (6.50);
    }
}