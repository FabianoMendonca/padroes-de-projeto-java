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
public class DecoyDuck extends Duck{
    public DecoyDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
        layeggsBehavior = new LayNoWay();
    }
    
    public void display(){
        System.out.println("Um simples pato de decoração");
    }
    
}
