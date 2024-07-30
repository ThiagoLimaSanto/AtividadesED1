package com.mycompany.atividade03;

import java.util.LinkedList;
import java.util.Queue;

public class FilaDeEspera {

    private Aviao aviao;

    public FilaDeEspera(Aviao aviao) {
        this.aviao = aviao;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public Queue addAviaoFilaDeEspera(Aviao aviao) {
        Queue<Aviao> filaDeEspera = new LinkedList();

        filaDeEspera.add(aviao);

        return filaDeEspera;
    }

    public Aviao caracteristicaAviaoDeEspera(Queue<Aviao> filaDeEspera) {
        return filaDeEspera.peek();
    }
}
