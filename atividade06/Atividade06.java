package com.mycompany.atividade06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Atividade06 {

    public static void main(String[] args) {
        Queue fila = new LinkedList();
        Stack pilha = new Stack();
        Random sorteio = new Random();
        int max = 1000;
        int min = -1000;

        for (int i = 0; i < 1000; i++) {
            int num = min + sorteio.nextInt(max - min + 1);
            fila.add(num);
        }

        while (!fila.isEmpty()) {
            Object obj = fila.peek();
            int value = (Integer) obj;
            if (value >= 0) {
                pilha.add(fila.poll());
            } else {
                System.out.println(fila.poll());
            }
        }
    }
}
