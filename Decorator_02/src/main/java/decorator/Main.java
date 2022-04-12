/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 *
 * Fabiano Souza Mendonça      119992
 * Francisco de Assis Martins 76897
 */

public class Main {
    public static void main(String[] args)
    {
        Drinks Pedido = null;
        
        while(true){
            Scanner scan = new Scanner(System.in);
            int menu=0;
            int sz;
            boolean size;
            
            do{
                System.out.println("Escolha o Drink:\n");
                System.out.println("1 - Bellini \n"
                                   + "2 - Caipirinha\n"
                                   + "3 - Frozen\n"
                                   + "4 - Margarita\n"
                                   + "5 - Mojito\n"
                                   + "0 - Sair");
                menu = scan.nextInt();
                System.out.println("Escolha o Tamanho do Drink:\n");
                System.out.println("1 - Pequeno \n"
                                   + "2 - Grande\n"
                                   + "0 - Voltar\n");
                sz = scan.nextInt();
                size = (sz == 1);
                if (sz != 1 && sz != 2) menu = 10;
            }while (menu < 0 || menu >5);
            switch (menu){
                case 0:
                    break;
                case 1:
                    Bellini bellini = new Bellini(size);
                    Pedido = bellini;
                    System.out.println("Você escolheu "+bellini.getDescription());
                    break;
                case 2:
                    Caipirinha caipirinha = new Caipirinha(size);
                    Pedido = caipirinha;
                    System.out.println("Você escolheu "+caipirinha.getDescription());
                    break;
                case 3:
                    Frozen frozen = new Frozen(size);
                    Pedido = frozen;
                    System.out.println("Você escolheu "+frozen.getDescription());
                    break;
                case 4:
                    Margarita margarita = new Margarita(size);
                    Pedido = margarita;
                    System.out.println("Você escolheu "+margarita.getDescription());
                    break;
                case 5:
                    Mojito mojito = new Mojito(size);
                    Pedido = mojito;
                    System.out.println("Você escolheu "+mojito.getDescription());
                    break;
            }
            if (menu !=0){
                do{
                    System.out.println("Escolha os adicionais:");
                    System.out.println("1 - Açucar\n"
                            + "2 - Adoçante\n"
                            + "3 - Cachaça\n"
                            + "4 - Leite Condensado\n"
                            + "5 - Limão\n"
                            + "6 - Morango\n"
                            + "7 - Saque\n"
                            + "8 - Finalizar\n");
                    menu = scan.nextInt();
                    int dose;
                    switch(menu){
                        case 1:
                            System.out.println("Deseja adicionar quantas colheres de Açucar");
                            dose = scan.nextInt();
                            for (int i = 0; i < dose; i++) {
                                Pedido = new Acucar(Pedido);
                            }
                            System.out.println("Você adicionou "+dose+" colher(es)");
                            break;
                        case 2:
                            System.out.println("Deseja adicionar quantas doses de Adoçante");
                            dose = scan.nextInt();
                            for (int i = 0; i < dose; i++) {
                                Pedido = new Adocante(Pedido);
                            }
                            System.out.println("Você adicionou "+ dose+" dose(s)");
                            break;
                        case 3:
                            System.out.println("Deseja adicionar quantas doses de Cachaça");
                            dose = scan.nextInt();
                            for (int i = 0; i < dose; i++) {
                                Pedido = new Cachaca(Pedido);
                            }
                            System.out.println("Você adicionou "+ dose+" dose(s)");
                            break;
                        case 4:
                            System.out.println("Deseja adicionar quantas doses de Leite Condensado");
                            dose = scan.nextInt();
                            for (int i = 0; i < dose; i++) {
                                Pedido = new LeiteCondensado(Pedido);
                            }
                            System.out.println("Você adicionou "+ dose+" dose(s)");
                            break;
                        case 5:
                            System.out.println("Deseja adicionar quantas unidades de Limão");
                            dose = scan.nextInt();
                            for (int i = 0; i < dose; i++) {
                                Pedido = new Limao(Pedido);
                            }
                            System.out.println("Você adicionou "+ dose+" Limão(ões)");
                            break;
                        case 6:
                            System.out.println("Deseja adicionar quantas unidades de Morango");
                            dose = scan.nextInt();
                            for (int i = 0; i < dose; i++) {
                                Pedido = new LeiteCondensado(Pedido);
                            }
                            System.out.println("Você adicionou "+ dose+" Morango(s)");
                            break;
                        case 7:
                            System.out.println("Deseja adicionar quantas doses de Saque");
                            dose = scan.nextInt();
                            for (int i = 0; i < dose; i++) {
                                Pedido = new Saque(Pedido);
                            }
                            System.out.println("Você adicionou "+ dose+" dose(s)");
                            break;
                        case 8:
                            break;
                    
                    
                    }        
                }while(menu!= 8);
            }
            else {
                System.exit(0);
            }
            
            System.out.println("Você Pediu um : "+Pedido.getDescription());
            String valor = new DecimalFormat("0.00").format(Pedido.cost());
            System.out.println("Valor total: U$"+valor);
            System.out.println("");
            System.out.println("Deseja fazer outro pedido ? digite 1. \ndigite 0 para sair");
            menu = scan.nextInt();
            if(menu == 0){
                 System.exit(0);
            } 
        }
    }
}