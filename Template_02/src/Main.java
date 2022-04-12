/*
 * Fabiano Souza Mendonça      119992
 * Francisco de Assis Martins 76897
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String answer = "";
        while(!answer.toLowerCase().matches("exit")){
            System.out.println("Do u wanna a Coffe or Tea?\n"
                    + "Type it 'exit' to leave");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            try {
               answer = in.readLine();
            } catch(IOException ioe){
                System.out.println("IO error trying read your answers");
            }
            if(answer.toLowerCase().matches("tea")){
                System.out.println("Making Tea...");
                Tea cha = new Tea();
                cha.prepareRecipe();
                System.out.println("wanna something else?(y/n)");
                try {
                    answer = in.readLine();
                } catch(IOException ioe){
                     System.out.println("IO error trying read your answers");
                }
                if(answer.toLowerCase().startsWith("n")){
                    answer = "exit";
                }
            }else if(answer.toLowerCase().matches("coffe")){
                System.out.println("Making Coffee...");
                Coffe cafe = new Coffe();
                cafe.prepareRecipe();
                System.out.println("wanna something else?(y/n)");
                try {
                    answer = in.readLine();
                } catch(IOException ioe){
                     System.out.println("IO error trying read your answers");
                }
                if(answer.toLowerCase().startsWith("n")){
                    answer = "exit";
                }
            }
        }    
        
    }

}
