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
public class MassaAioli extends PratoDeMassa {

    public MassaAioli(int temp) {
        this.tempo = temp;
    }
    @Override
    public void preparaIngredientes(){
        System.out.println("Separe :4 dentes de alho picados," +
                           " 2 gemas de ovo," +
                           " 250 ml de azeite de oliva extra virgem," +
                           " 2 colheres (chá) de suco de limão siciliano," +
                           " sal e pimenta-do-reino moída na hora a gosto");
    }
    @Override
    public void preparaMolho(){
        System.out.println("Bata bem as gemas em uma tigela.\n"
                + "Junte o alho e acrescente aos poucos o azeite, batendo sempre até obter um creme homogêneo.\n"
                + "Misture o suco de limão e tempere com sal e pimenta a gosto.\n" 
                +"Leve para a geladeira.");
    }
    @Override
    public void finaliza(){
        System.out.println("Retirar a água da massa, misturar o molho e pronto.");
    }
    
    
}
