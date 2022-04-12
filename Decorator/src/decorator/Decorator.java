
package decorator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Beverage Pedido = null;
                
        while(true){
            Scanner entrada = new Scanner(System.in);
            int menu;
            do{
                System.out.println("Escolha seu café:");
                System.out.println("1 - DarkRoast \n"
                                   + "2 - Decaf\n"
                                   + "3 - Espresso\n"
                                   + "4 - HouseBlend\n"
                                   + "0 - Sair");
                menu = entrada.nextInt();
            }while(menu<0 ||menu>4);
            switch(menu){
                case 0:
                    break;
                case 1:
                    DarkRoast darkroast = new DarkRoast();
                    Pedido = darkroast;
                    System.out.println("Você escolheu "+darkroast.getDescription());
                    break;
                case 2:
                    Decaf decaf = new Decaf();
                    Pedido = decaf;
                    System.out.println("Você escolheu "+decaf.getDescription());
                    break;
                case 3:
                    Espresso espresso = new Espresso();
                    Pedido = espresso;
                    System.out.println("Você escolheu "+espresso.getDescription());
                    break;
                case 4:
                    HouseBlend houseblend = new HouseBlend();
                    Pedido = houseblend;
                    System.out.println("Você escolheu "+houseblend.getDescription());
                    break;
            }
            if(menu == 0){}else{
                do{
                    System.out.println("Escolha os adicionais:");
                    System.out.println("1 - Mocha\n"
                            + "2 - Soy\n"
                            + "3 - SteamedMilk\n"
                            + "4 - Whip\n"
                            + "5 - Finalizar\n");
                    menu = entrada.nextInt();
                    int dose;
                    switch(menu){
                        case 1:
                            System.out.println("Deseja adicionar quantas doses de Mocha");
                            dose = entrada.nextInt();
                            for (int i = 0; i < dose; i++) {
                                Pedido = new Mocha(Pedido);
                            }
                            System.out.println("Você adicionou "+ dose+" dose(s)");
                            break;
                        case 2:
                            System.out.println("Deseja adicionar quantas doses de Soy");
                            dose = entrada.nextInt();
                            for (int i = 0; i < dose; i++) {
                                Pedido = new Soy(Pedido);
                            }
                            System.out.println("Você adicionou "+ dose+" dose(s)");
                            break;
                        case 3:
                            System.out.println("Deseja adicionar quantas doses de Mocha");
                            dose = entrada.nextInt();
                            for (int i = 0; i < dose; i++) {
                                Pedido = new SteamedMilk(Pedido);
                            }
                            System.out.println("Você adicionou "+ dose+" dose(s)");
                            break;
                        case 4:
                            System.out.println("Deseja adicionar quantas doses de Mocha");
                            dose = entrada.nextInt();
                            for (int i = 0; i < dose; i++) {
                                Pedido = new Whip(Pedido);
                            }
                            System.out.println("Você adicionou "+ dose+" dose(s)");
                            break;
                        case 5:
                            break;
                    
                    
                    }        
                }while(menu!= 5);
            }   
            if(menu == 0){
                 System.exit(0);
            }   
            System.out.println("Você Pediu um : "+Pedido.getDescription());
            String valor = new DecimalFormat("0.00").format(Pedido.cost());
            System.out.println("Valor total: U$"+valor);
            System.out.println("");
            System.out.println("Deseja fazer outro pedido ? digite 1. \ndigite 0 para sair");
            menu = entrada.nextInt();
            if(menu == 0){
                 System.exit(0);
            }   
        }
    }
}
