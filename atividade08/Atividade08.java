
package com.mycompany.atividade08;

import java.util.Random;

public class Atividade08 {

    public static void main(String[] args) {
        Random sorteio = new Random();
        TestePilha testePilha = new TestePilha();
        
        int max = 100;
        int min = -100;

        for (int i = 0; i < 1000; i++) {
            int num = min + sorteio.nextInt(max - min + 1);
            testePilha.teste(num);
        }
    }
}
