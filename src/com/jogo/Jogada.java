package com.jogo;

public class Jogada {

    public String joga(TipoDeJogada tipo, String j1){
        tipo.setVencedor();
        return tipo.findVencedor(j1);
    }
}
