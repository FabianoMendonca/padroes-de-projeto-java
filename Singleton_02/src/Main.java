/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mendo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FilaImpressao fila = FilaImpressao.newFila();
        FilaImpressao fila2 = FilaImpressao.newFila();
        for (int i = 0; i < 10; i++) {
            Tarefa task = new Tarefa();
            fila.insereFila(task);
            fila2.insereFila(task);
            /*
            *Foram feitas 2 declarações de fila, entretanto as duas correspondem ao mesmo objeto
            *Logo se add o mesmo elemento nas filas, o elemento se torna duplicado
            */
        }
        
        /*
        * mesmo com duas declarações diferentes da fila existe somente uma instancia da mesma
        * logo, se remover o elemento da fila 2 o elemento também é removido da primeira fila!!
        */
        fila2.Remove();
        System.out.println("Fila 1:");
        fila.ImprimeFila();
        System.out.println(" ");
        System.out.println("Fila 2:");
        fila2.ImprimeFila();
        
        fila.ImprimeTarefa();
        fila2.Remove();
        fila.ImprimeTarefa();
    }
    
}
