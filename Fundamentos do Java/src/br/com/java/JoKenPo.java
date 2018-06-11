package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class JoKenPo {

	public static void main(String[] args) {
		int jogador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("JoKenPo");
		System.out.println("");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("-------------------------");
		System.out.print("Digite a opção desejada: ");
		jogador = teclado.nextInt();
		System.out.println("--------------------------");
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
			System.out.println("Computador escolheu Pedra");
			break;
		case 2:
			Papel();
			System.out.println("Computador escolheu Papel");
			break;
		case 3:
			Tesoura();
			System.out.println("Computador escolheu Tesoura");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		
		}
		
		if ( 
			
		}
	}

	static void Tesoura() {
	}

	static void Papel() {
	}

	static void Pedra() {
	}

}
