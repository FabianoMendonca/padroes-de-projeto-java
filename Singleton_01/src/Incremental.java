/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mendo
 */
public class Incremental {
    private static int count = 0;
    private int numero;
    private static Incremental instancia = null;
    
    private Incremental (){
        numero = ++ count;
    }
    public static Incremental getInstancia(){
        if (instancia == null) {
            instancia = new Incremental();
        }
        return instancia;
    }
    @Override
    public String toString(){
        return "Incremental "+ numero;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Incremental.count = count;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
