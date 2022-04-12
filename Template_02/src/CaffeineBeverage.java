/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mendo
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCodiments()) {
            addCodiments();
        }
    }
    abstract void brew();
    abstract void addCodiments();
    
    private void boilWater(){
        System.out.println("Boiling water.");
    }    
    private void pourInCup(){
        System.out.println("Pouring into cup.");
    }
    boolean customerWantsCodiments(){
        return true;
    }

}
