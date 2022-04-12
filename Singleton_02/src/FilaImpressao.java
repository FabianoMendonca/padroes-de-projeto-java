
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mendo
 */
public final class FilaImpressao {
    private static final FilaImpressao filaunica = new FilaImpressao();
    private final LinkedList<Tarefa> FilaTask;
  
    private boolean vazia;
    
    private FilaImpressao(){
        this.FilaTask = new LinkedList<>();
        this.vazia = true;
    }
     public static FilaImpressao newFila(){
       return filaunica;
    }
     
    public void ImprimeFila(){
        if (vazia) {
            System.out.println("A fila está vazia!!!");
        }else{
            FilaTask.forEach((FilaTask1) -> {
                FilaTask1.printTask();
            });
        }
    }
    public void insereFila(Tarefa task){
        /*
        *
        *Verifica se o elemento já está na fila, evitando a duplicação
      
        if(this.FilaTask.contains(task)){
        } else {
            this.FilaTask.add(task);
        }
        */
        this.FilaTask.add(task);
        
        if (vazia) {
            this.vazia = false;
        }
    }
    public void ImprimeTarefa(){
        if (vazia) {
            System.out.println("Lista Vazia");
        }else{
            System.out.println("Tarefa atual:");
            this.FilaTask.get(0).printTask();
        }
    }
    public void Remove(){
        this.FilaTask.remove(0);
    }
}
