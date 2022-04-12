/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mendo
 */
public class Marguerita extends Pizza {
    private static final String def = ("Ingredientes: Molho de tomate natural temperado com azeite, sal e orégano, queijo mussarela fatiado,orégano e manjericão fresco.");
    public Marguerita(){
        setPreco( 28.00); 
        
    }
    @Override
        public void Printpizza(){
        super.Printpizza();
        System.out.println("Preço : "+ this.getPreco());
        System.out.println(def);
        System.out.println("");
        }

}
