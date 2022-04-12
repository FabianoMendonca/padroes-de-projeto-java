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
public class Bellini extends Drinks {
    
    public Bellini(boolean size){
        if (size) description = "Bellini Pequeno";
        else description = "Bellini Grande";
        setSize(size);
    }
    public double cost(){
        if (size) return (6.00);
        else return (11.00);
    }
}