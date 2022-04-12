
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mendo
 */
public class Coffe extends CaffeineBeverage {
    


    public void brew(){
        System.out.println("Dripping coffee through filter.");
    }
    
    public void addCodiments(){
        System.out.println("Adding Sugar and Milk");
    }
    @Override
    
    public boolean customerWantsCodiments(){
        String answer = getUserInput();
        
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }
    private String getUserInput(){
    
        String answer = null;
        System.out.println("Would u like milk and sugar with your coffe ? (Y/N)");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch(IOException ioe){
            System.out.println("IO error trying read your answers");
        }
        if(answer == null){
            return "no";
        }
        return answer;
    }
    
}
