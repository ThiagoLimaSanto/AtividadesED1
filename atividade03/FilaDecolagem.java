package com.mycompany.atividade03;

import java.util.LinkedList;
import java.util.Queue;

public class FilaDecolagem {
    private Aviao aviao;

    public FilaDecolagem(Aviao aviao) {
        this.aviao = aviao;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }
    
    public Queue addAviaoFilaDeDecolagem(Aviao aviao){
        Queue filaDeDecolagem = new LinkedList();
        
        filaDeDecolagem.add(aviao);
        
        return filaDeDecolagem;
    }
    
    public int numeroDeAviaoNaDecolagem(Queue filaDeEspera){
        return filaDeEspera.size();
    }
    
    public  Aviao autorizarAviao(Queue<Aviao> filaDeDecolagem){
        return filaDeDecolagem.poll();
    }
    
    public int numeroDeAviaoNaDecolage(Queue filaDeDecolagem){
        return filaDeDecolagem.size();
    }
}
