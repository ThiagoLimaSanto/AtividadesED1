package com.mycompany.atividade04;

import java.util.Queue;
import java.util.Stack;

public class Inverte {

    Stack pilha = new Stack();

    public Queue inverteFila(Queue fila) {
        while (!fila.isEmpty()) {
            pilha.add(fila.poll());
        }
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
        return fila;
    }
}
