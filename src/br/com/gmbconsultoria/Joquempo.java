package br.com.gmbconsultoria;

import java.util.Random;
import java.util.Scanner;

public class Joquempo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int jogador = 0, robo = 0, opcao = 0;

        while(opcao != 3){
            System.out.println("Seja bem vindo!");
            System.out.println("Escolha uma opção!");
            System.out.println("1 - Jogar?");
            System.out.println("2 - Pontuação");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Vamos jogar?");
                    System.out.println("Escolha uma das seguintes opções: 1 para Pedra, 2 para Papel ou 3 para tesoura.");
                    System.out.println("Qual opção você quer? ");

                    int escolhaJogador = scanner.nextInt();
                    int escolhaRobo = new Random().nextInt(3) + 1;

                    System.out.println("Escolhas: Jogador ("+escolhaJogador+") e Robô ("+escolhaRobo+")");

                    if( (escolhaJogador == 3 && escolhaRobo == 2) || (escolhaJogador == 2 && escolhaRobo == 1) || (escolhaJogador == 1 && escolhaRobo == 3)){
                        jogador++;
                        System.out.println("Você ganhou parabéns!!!.");
                    } else if( escolhaJogador == escolhaRobo){
                        System.out.println("Deu empate!.");
                    } else {
                        robo++;
                        System.out.println("Você perdeu!.");
                    }
                    break;
                case 2:
                    System.out.println("Pontuação:");
                    if(jogador == 1){
                        System.out.println("Jogador - "+ jogador +" ponto.");
                    }else {
                        System.out.println("Jogador - "+ jogador +" pontos.");
                    }
                    if(robo == 1){
                        System.out.println("robo - "+ robo +" ponto.");
                    }else {
                        System.out.println("robo - "+ robo +" pontos.");
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
