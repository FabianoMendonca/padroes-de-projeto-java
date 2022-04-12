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
public class DonaldDuck extends Duck{
    public DonaldDuck(){
        quackBehavior = new SpeakQuack();
        flyBehavior = new FlyWithAirplane();
        layeggsBehavior = new LayNoWay();
    }
    
    public void display(){
        System.out.println("Eu sou o Pato Donald");
    }
}
