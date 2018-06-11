package br.com.java;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int opcao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("1. Windows");
		System.out.println("2. Linux");
		System.out.print("Digite a opção desejada: ");
		opcao = teclado.nextInt();
		switch (opcao) {
		case 1:
			windows(); //executar o método
			break;
		case 2:
			linux();
			break;
		default: //caso nenhuma opção selecionada
			System.out.println("Opção inválida");
			break;
		}

	}
	
	//criando um método
	static void windows() {
		System.out.println("Carregando o Windows.......");
	}

	static void linux() {
		System.out.println("Carregando o Linux.....");
	}
}
