/** 
 * Atividade JoKenPo
 * @author Sabrina, Geovani e Victor Leite
 * Data 06/13/2018
 */


package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class JoKenPo {

	public static void main(String[] args) {
		int jogador;
		int player1 = 0;
		int player2 = 0;
		char opcao;
		Scanner teclado = new Scanner(System.in);
		do {
		System.out.println("JoKenPo");
		System.out.println("");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("----------------------------");
		System.out.print("Digite a opção desejada: ");
		jogador = teclado.nextInt();
		System.out.println("----------------------------");
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu Pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu Papel");
			break;
		case 3:
			System.out.println("Jogador escolheu Tesoura");
			break;
		default:
			System.out.println("Opção inválida");
			break;
			
		}
		Random maquina = new Random();
		int computador = maquina.nextInt(2) + 1;
		switch (computador) {
		case 1:
			Pedra();
			System.out.println(" ");
			System.out.println("Computador escolheu Pedra");
			break;
		case 2:
			Papel();
			System.out.println(" ");
			System.out.println("Computador escolheu Papel");
			break;
		case 3:
			Tesoura();
			System.out.println(" ");
			System.out.println("Computador escolheu Tesoura");
			break;
		default:
			System.out.println(" ");
			System.out.println("Opção inválida");
			break;
		
		}
		
		if (jogador == 1 && computador == 3 || jogador == 2 && computador == 1 || jogador == 2 && computador == 3 ) {
			System.out.println("----------------------------");
			System.out.println("******JOGADOR VENCEU******");
			player1++;
			System.out.println("PLACAR: " + player1 + "X" + player2);
		}else if (computador == 1 && jogador == 3 || computador == 2 && jogador == 1 || computador == 2 && jogador == 3 ) {
			System.out.println("----------------------------");
			System.out.println("******COMPUTADOR VENCEU*******");
			player2++; 
			System.out.println("PLACAR: " + player1 + "X" + player2);
		} else {
			System.out.println("----------------------------");
			System.out.println("******EMPATE******");
			System.out.println("PLACAR: " + player1 + "X" + player2);
		}
		
		System.out.print("Deseja jogar novamente(s/n)? ");
		opcao = teclado.next().charAt(0);
	}while(opcao == 's');
	}

	static void Tesoura() {
	}

	static void Papel() {
	}

	static void Pedra() {
	}

}
