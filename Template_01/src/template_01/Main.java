
package template_01;

/**
 * Fabiano Souza Mendonça      119992
 * Francisco de Assis Martins 76897
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MassaCarbonara massaCarbonara = new MassaCarbonara(12);
        massaCarbonara.preparaReceita();
        
        MassaAioli aioli = new MassaAioli(15);
        aioli.preparaReceita();
    }
    
}
