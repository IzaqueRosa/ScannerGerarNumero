package visao;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import modelo.Calculo;

public class Principal {

    public static void main(String args[]) throws InterruptedException{
        Scanner keyboard = new Scanner(System.in);
        String token = "";
        boolean exit = false;

        System.out.println("-----INÍCIO DO PROJETO-----\n");

        do {

            System.out.print("Informe um número para somar ou \"exit\" para sair:");
            token = keyboard.nextLine();
            System.out.print("\n");

            if (token.equalsIgnoreCase("exit")) {
                exit = true;
            } else {
                
                Calculo c = new Calculo(token);
                               
                if (c.getNumUser() >= 0 && c.getNumUser() <= 10) {
            
                    System.out.println("O número informado pelo usuário foi: " + c.getNumUser());
                    System.out.println("O número gerado aleatoriamente foi: " + c.getNumRand());
                    System.out.println("A multiplicação dos dois números é: " + c.somarNumeros());

                    System.out.print("\n");
                    System.out.println("-----INFORME UM NOVO NÚMERO-----\n");

                } else {
                    System.out.println("NÚMERO FORA DO RANGE PERMITIDO, INFORME UM NOVO NÚMERO\n");
                }
            }

        } while (!exit);
    }

}
