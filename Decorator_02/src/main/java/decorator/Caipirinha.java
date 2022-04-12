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
public class Caipirinha extends Drinks {
    
    public Caipirinha(boolean size){
        if (size) description = "Caipirinha Pequeno";
        else description = "Caipirinha Grande";
        
        setSize(size);
    }
    public double cost(){
        if (size) return (4.00);
        else return (7.00);
    }
}