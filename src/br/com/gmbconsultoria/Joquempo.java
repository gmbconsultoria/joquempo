package br.com.gmbconsultoria;

import java.util.Random;
import java.util.Scanner;

public class Joquempo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontosJogador = 0, pontosRobo = 0, opcao = 0;
        System.out.println("Seja bem vindo!");
        while(opcao != 3){
            mostraMenu();
            opcao = scanner.nextInt();
            if(opcao == 1) {
                mostrarOpcoesDeJogo();
                int escolhaJogador = scanner.nextInt();
                int escolhaRobo = logicaDoRobo();
                mostrarEscolhas(escolhaJogador, escolhaRobo);
                if ((escolhaRobo == 3 && escolhaJogador == 2) || (escolhaRobo == 2 && escolhaJogador == 1) || (escolhaRobo == 1 && escolhaJogador == 3)) {
                    pontosRobo++;
                    System.out.println("Você perdeu!.");
                    System.out.println();
                } else if (escolhaJogador == escolhaRobo) {
                    System.out.println("Deu empate!.");
                    System.out.println();
                } else {
                    pontosJogador++;
                    System.out.println("Você ganhou parabéns!!!.");
                    System.out.println();
                }
            } else if (opcao == 2) {
                mostrarPontuacao(pontosJogador, pontosRobo);
            } else if (opcao == 3) {
                System.out.println("Obrigado por jogar!");
            } else {
                System.out.println("Opção inválida!");
            }
            System.out.println();
        }
    }

    public static int logicaDoRobo(){
        int escolhaRobo = new Random().nextInt(3) + 1;
        return escolhaRobo;
    }

    public static void mostraMenu(){
        System.out.println("Escolha uma opção!");
        System.out.println("1 - Jogar?");
        System.out.println("2 - Pontuação");
        System.out.println("3 - Sair");
        System.out.println();
    }

    public static void mostrarOpcoesDeJogo(){
        System.out.println("Vamos jogar?");
        System.out.println("Escolha uma das seguintes opções: 1 para Pedra, 2 para Papel ou 3 para tesoura.");
        System.out.println("Qual opção você quer? ");
    }

    public static void mostrarEscolhas(int escolhaJogador, int escolhaRobo){
        System.out.println();
        System.out.println("Escolhas: Jogador (" + escolhaJogador + ") e Robô (" + escolhaRobo + ")");
        System.out.println();
    }

    public static void mostrarPontuacao(int pontosJogador, int pontosRobo){
        System.out.println();
        System.out.println("Pontuação:");
        if (pontosJogador == 1) {
            System.out.println("Jogador - " + pontosJogador + " ponto.");
        } else {
            System.out.println("Jogador - " + pontosJogador + " pontos.");
        }
        if (pontosRobo == 1) {
            System.out.println("robo - " + pontosRobo + " ponto.");
        } else {
            System.out.println("robo - " + pontosRobo + " pontos.");
        }
    }

}
