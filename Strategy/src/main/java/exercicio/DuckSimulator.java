/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Scanner;

/*
 * Fabiano Souza Mendonça      119992
 * Francisco de Assis Martins 76897
 */

public class DuckSimulator {
    public static void main(String[] args)
    {
        Duck duck = null;
        while(true){
            Scanner scan = new Scanner(System.in);
            int menu=0;
            do{
                System.out.println("\n1Escolha um Pato:");
                System.out.println("1 - Decoy Duck\n"
                                   + "2 - Donald Duck\n"
                                   + "3 - Mallard Duck\n"
                                   + "4 - Rubber Duck\n"
                                   + "0 - Sair");
                menu = scan.nextInt();
            }while (menu < 0 || menu >4);
            switch (menu){
                case 0:
                    break;
                case 1:
                    duck = new DecoyDuck();
                    break;
                case 2:
                    duck = new DonaldDuck();
                    break;
                case 3:
                    duck = new MallardDuck();
                    break;
                case 4:
                    duck = new RubberDuck();
                    break;
            }
            if (menu !=0){
                System.out.println("Você escolheu: ");
                duck.display();
                do{
                    System.out.println("\nEscolha uma performance:");
                    System.out.println("1 - Fly\n"
                            + "2 - Quack\n"
                            + "3 - Swim\n"
                            + "4 - Lay Eggs\n"
                            + "5 - Voltar");
                    menu = scan.nextInt();
                    switch(menu){
                        case 1:
                            duck.performFly();
                            break;
                        case 2:
                            duck.performQuack();
                            break;
                        case 3:
                            duck.swim();
                            break;
                        case 4:
                            duck.performLayEggs();
                            break;
                        case 5:
                            break;
                    }        
                }while(menu!=5);
            }
            else {
                System.exit(0);
            }
        }
    }
}