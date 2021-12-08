package br.com.gmbconsultoria;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pontosJogador = 0;
        int pontosRobo = 0;
        int opcao = 0;


        while (opcao != 3) {
            System.out.println("Seja bem vindo!");
            System.out.println("Escolha uma opção!");
            System.out.println("1 - Jogar?");
            System.out.println("2 - Pontuação");
            System.out.println("3 - Sair");

            opcao = scan.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Faça sua escolha: 1- Pedra, 2- Papel ou 3- Tesoura.");
                    int escolhaJogador = scan.nextInt();
                    int escolhaRobo = new Random().nextInt(3) + 1;
                    System.out.println("Escolhas: Jogador: (" + escolhaJogador + ") e Robô: (" + escolhaRobo + ")");

                    if ((escolhaJogador == 2 && escolhaRobo == 3) || (escolhaJogador == 1 && escolhaRobo == 2) || (escolhaJogador == 3 && escolhaRobo == 1)) {
                        pontosRobo++;
                        System.out.println("Voce perdeu!");

                    } else if (escolhaJogador == escolhaRobo) {
                        System.out.println("Empate!!");
                    } else {
                        pontosJogador++;
                        System.out.println("Voce ganhou, parabens!!");
                    }
                    break;

                case 2:
                    System.out.println("Pontuação:");
                    if (pontosJogador == 1) {
                        System.out.println("Jogador: " + pontosJogador + " ponto.");
                    } else {
                        System.out.println("Jogador: " + pontosJogador + " pontos.");
                    }
                    if (pontosRobo == 1) {
                        System.out.println("Robo: " + pontosRobo + " ponto.");
                    } else {
                        System.out.println("Robo: " + pontosRobo + " pontos.");
                    }
                    break;

                case 3:
                    System.out.println("Obrigado por jogar!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        }

    }
}







