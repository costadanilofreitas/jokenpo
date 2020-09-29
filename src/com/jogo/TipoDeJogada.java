package com.jogo;

import java.util.ArrayList;
import java.util.List;

public interface TipoDeJogada {

    List vencedor = new ArrayList<>();

    String findVencedor(String j1);

    void setVencedor();

}
