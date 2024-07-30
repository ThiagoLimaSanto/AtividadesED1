package com.mycompany.atividade01;

import java.util.Scanner;
import java.util.Stack;

public class Atividade01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<String> pilha1 = new Stack<>();
        Stack<String> pilha2 = new Stack<>();
        Stack<String> pilha3 = new Stack<>();
        boolean boo = false;
        while (true) {
            System.out.println("Digite algum caractere/0 para parar: ");
            String caractere = scan.nextLine();
            if (caractere.equals("0")) {
                break;
            }
            pilha1.add(caractere);
            pilha2.add(caractere);
        }

        System.out.println("[1]-imprimir inverso\n"
                + "[2]-Verificar se o texto é um palíndromo");
        int escolha = scan.nextInt();
        scan.nextLine();
        switch (escolha) {
            case 1:
                while(!pilha1.isEmpty()){
                    System.out.println(pilha1.pop());
                }
                break;

            case 2:
                while(!pilha2.isEmpty()){
                    pilha3.add(pilha2.pop());
                }
                while(!pilha1.isEmpty()){
                    if (pilha1.pop().equals(pilha3.pop())) {
                        boo = true;
                    } else {
                        boo = false;
                    }
                }
                if (boo) {
                    System.out.println("E um palindromo!");
                } else {
                    System.out.println("Nao é uma palindromo!");
                }
        }
    }
}