/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author fam19
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    LayEggsBehavior layeggsBehavior;
    
    public Duck(){
        
    }
    
    public abstract void display();
    
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void swim(){
        System.out.println("Todos os patos nadam, nem que seja flutuando");
    }
    
    public void performLayEggs(){
        layeggsBehavior.layeggs();
    }
    
    
    
    
}
