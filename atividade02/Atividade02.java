package com.mycompany.atividade02;

import java.util.Scanner;
import java.util.Stack;


public class Atividade02 {

    public static void main(String[] args) {
        Stack pilha = new Stack();
        Stack pilha2 = new Stack();
        Scanner scan = new Scanner(System.in);

        System.out.println("digite palavra em letras minusculas 1: ");
        String[] palavra = scan.nextLine().split("");
        System.out.println("digite um caractere: ");
        String chave = scan.nextLine();
        
        for (int i = 0; i < palavra.length; i++) {
            if(chave.equals(palavra[i])){
                palavra[i] = "";
            }
            pilha.add(palavra[i]);
        }
        
        for (int i = 0; i < palavra.length; i++) {
            pilha2.add(pilha.pop());
        } 
        
        for (int i = 0; i < palavra.length; i++) {
            System.out.print(pilha2.pop());
        }  
    }
}