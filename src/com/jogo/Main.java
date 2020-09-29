package com.jogo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a jogada do j1 com uma das opções: Pedra, Papel, Tesoura, Spock ou Lagarto");
        String j1 = sc.nextLine();
        System.out.println("Digite a jogada do j2:");
        String j2 = sc.nextLine();

        if (j1.equals(j2)){
            System.out.println("Empate");
            return;
        }

        try{
            Object obj = Class.forName("com.jogo." + j2).newInstance();

            Jogada jogada = new Jogada();

            String vencedor = jogada.joga((TipoDeJogada) obj, j1);

            System.out.println("Vencedor: " + vencedor);
        } catch (Exception e){
            System.out.println("Opção inválida");
            return;
        }
    }
}
