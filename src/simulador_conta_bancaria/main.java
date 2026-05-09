package simulador_conta_bancaria;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("-----MENU DE OPÇÕES-----");
            System.out.println("1- CRIAR CONTA DE BANCARIA");
            System.out.println("2- Depositar dinheiro");
            System.out.println("3- Sacar dinheiro");
            System.out.println("4- Exibir saldo");
            System.out.println("0- Sair");

            int opcao = input.nextInt();

            if(opcao == 1){


            }else if(opcao == 2){

            }else if(opcao == 3){

            }else if(opcao == 4){

            } else if (opcao == 0) {
                System.out.println("Obrigado por usar o programa!");
                break;
            }else {
                System.out.println("Opcão invalida!");
                break;
            }
        }
    }
}
