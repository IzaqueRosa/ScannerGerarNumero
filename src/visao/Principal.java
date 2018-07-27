package visao;

import java.util.Scanner;

public class Principal {

    public static void main(String args[]) throws InterruptedException {
        Scanner keyboard = new Scanner(System.in);
        String token = null;
        int numUser = 0;
        int numRand = 0;
        boolean exit = false;

        System.out.println("-----INÍCIO DO PROJETO-----\n");

        do {

            System.out.print("Informe um número para somar ou \"exit\" para sair:");
            token = keyboard.nextLine();
            System.out.print("\n");

            if (token.equalsIgnoreCase("exit")) {
                exit = true;
            } else {
                numUser = Integer.parseInt(token);
                if (numUser >= 0 && numUser <= 10) {
                    numRand = (int) (Math.random() * 21);

                    System.out.println("O número informado pelo usuário foi: " + numUser);
                    System.out.println("O número gerado aleatoriamente foi: " + numRand);
                    System.out.println("A soma dos dois números é: " + (numUser + numRand));
                    
                    Thread.currentThread().sleep(3000);
                            
                    System.out.print("\n");
                    System.out.println("-----INFORME UM NOVO NÚMERO-----\n");

                } else {
                    System.out.println("NÚMERO FORA DO RANGE PERMITIDO, INFORME UM NOVO NÚMERO\n");
                }
            }

        } while (!exit);
    }

}
