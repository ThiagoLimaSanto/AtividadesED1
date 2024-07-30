
package com.mycompany.atividade08;

import java.util.Stack;

public class TestePilha {
    Stack pilhaN = new Stack();
    Stack pilhaP = new Stack();
    
    public void teste(int num){
        if(num > 0){
            pilhaP.add(num);
        }else if(num < 0){
            pilhaN.add(num);
        }else{
            System.out.println("Pilha P = "+pilhaP.pop());
            System.out.println("Pilha N = "+pilhaN.pop());
        }
    }
}
