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
public abstract class Drinks {
    public String description = "NONE";
    public boolean size;
    public abstract double cost();
    public void setSize(boolean size){
        this.size = size;
    }
    public boolean getSize(){
        return size;
    }
    
    public String getDescription(){
        return description;
    }
}
