/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mendo
 */
public class Tarefa {
    private final int id_task;
    private static int count = 0;
    private String def;
    private String prioridade;
    public int getId(){
        return id_task;
    }

    /**
     * Tarefa recebe um Id unico e uma definição (doc, pdf, exemp, etc)
     */
    public Tarefa(){
        id_task = ++count;
        this.def = "default";
        this.prioridade = "default";
    }

    public void printTask(){
        System.out.println("Id: "+this.id_task+ " Def: "+this.def+";");
        System.out.println("Prioridade: "+ this.prioridade);
        
    }
    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
    
    
}
