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
public abstract class PratoDeMassa {
    public int tempo;
    
    final void preparaReceita(){
        aqueceAgua();
        cozinhaMassa(tempo);
        preparaIngredientes();
        preparaMolho();
        finaliza();

    }    

    abstract void preparaIngredientes();
    abstract void preparaMolho();
    abstract void finaliza();

    private void aqueceAgua(){
    System.out.println("Aquecendo agua");
    }
    
    private void cozinhaMassa(int tempo){
    System.out.println("Cozinhando massa: "+tempo+" minutos");
    }

}
