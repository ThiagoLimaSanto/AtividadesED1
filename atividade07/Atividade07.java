
package com.mycompany.atividade07;

import java.util.LinkedList;
import java.util.Queue;

public class Atividade07 {

    public static void main(String[] args) {
        Queue fila = new LinkedList();
        Inverte fila1 = new Inverte();
        
        for(int i = 0; i < 20; i++){
            fila.add(i);
        }
        
        fila1.inverte(fila);
        
        for(int i = 0; i < 20; i++){
            System.out.println(fila.poll());
        }
    }
}
