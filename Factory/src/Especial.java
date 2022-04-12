/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mendo
 */
public class Especial extends Pizza {
    private static final String def = ("Ingredientes: Agua e sal");

    
    public Especial(){
        setPreco(37.00);
    }
    
    @Override
    public void Printpizza(){
        super.Printpizza();
        System.out.println("Preço : "+ this.getPreco());
        System.out.println(def);
        System.out.println("");
    }

}
