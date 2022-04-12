/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template_01;

/**
 *
 * @author mendo
 */
public class MassaCarbonara extends PratoDeMassa {

    public MassaCarbonara(int tempo) {
        this.tempo = tempo;
    }
    
    @Override
    public void preparaIngredientes(){
        System.out.println("Cortar 200g bacon, bater 2 ovos, ralar 100g de queijo pecorino, pimento do reino à gosto");
    }
    public void preparaMolho() {
        System.out.println("fritar o bacon e misturar ao ovo batido,pimenta e queijo.");
    }
    @Override
    public void finaliza() {
    System.out.println("Retirar a água da massa, misturar o molho e misturar.");
    }

}
