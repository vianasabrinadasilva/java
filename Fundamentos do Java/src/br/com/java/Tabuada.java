package br.com.java;

import java.util.Scanner;

public abstract class Tabuada {

	public static void main(String[] args) {
		int valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("______ TABUADA ______");
		System.out.println("");
		System.out.print("Digite o valor da Tabuada: ");
		valor = teclado.nextInt();
		System.out.println("");
		for (int i = 1; i < 11; i++) {
			System.out.println(valor + " x " + i + "= " + (valor * i));
	}

	}

}
