package com.mycompany.atividade04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Atividade04 {

    public static void main(String[] args) {
        Inverte inverte = new Inverte();
        Random aleatorio = new Random();
        Queue fila = new LinkedList();
        
        for(int i = 0; i < 100; i++){
            int sorteio = aleatorio.nextInt(1000);
            fila.add(sorteio);
        }
        
        inverte.inverteFila(fila);
        
        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }
    }
}
