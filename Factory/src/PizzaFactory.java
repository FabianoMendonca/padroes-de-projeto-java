/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mendo
 */
public class PizzaFactory {
    public Pizza pizza;
    public String tipo;

    public Pizza PizzaFactory(String Ntipo) {
        this.pizza = null;
        this.tipo = Ntipo;
    
        switch (Ntipo){
            case "Carbonara":
                this.pizza = new Carbonara() ;
                this.pizza.setTipo("Carbonara");
                return this.pizza;
            case "Marguerita":
                this.pizza = new Marguerita();
                this.pizza.setTipo("Marguerita");
                return this.pizza;
            case "Especial":
                this.pizza = new Especial();
                this.pizza.setTipo("Especial");
                return this.pizza;
        }
    return null;
    }
    
    
    
}
