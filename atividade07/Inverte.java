
package com.mycompany.atividade07;

import java.util.Queue;
import java.util.Stack;

public class Inverte {

    Stack pilha = new Stack();

    public Queue inverte(Queue fila) {
        for (int i = 0; i < 20; i++) {
            pilha.add(fila.poll());
        }
        for (int i = 0; i < 20; i++) {
            fila.add(pilha.pop());
        }
        
        return fila;
    }
}
