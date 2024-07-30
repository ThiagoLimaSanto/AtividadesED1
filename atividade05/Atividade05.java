package com.mycompany.atividade05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Atividade05 {

    public static void main(String[] args) {
        Queue fila = new LinkedList();
        Stack pilha = new Stack();
        Random sorteio = new Random();

        for (int i = 0; i < 1000; i++) {
            int num = sorteio.nextInt(1000);
            if (fila.contains(num)) {
                pilha.add(num);
            } else {
                fila.add(num);
            }
        }

        System.out.print("Fila: ");
        while (!fila.isEmpty()) {
            System.out.print(" " + fila.poll());
        }

        System.out.println("");

        System.out.print("Pilha: ");
        while (!pilha.isEmpty()) {
            System.out.print(" " + pilha.pop());
        }
    }
}
