package com.jogo;

public class Spock implements TipoDeJogada{
    @Override
    public String findVencedor(String j1) {
        if(vencedor.contains(j1)){
            return "j1";
        }

        return "j2";
    }

    @Override
    public void setVencedor() {
        vencedor.add("Lagarto");
        vencedor.add("Papel");
    }
}
