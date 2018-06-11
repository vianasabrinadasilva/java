package br.com.java;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		int valor;
		int i = 1; //variavel de apoio ao laço while
		Scanner teclado = new Scanner(System.in);
		System.out.println("______ TABUADA com WHILE ______");
		System.out.println("");
		System.out.print("Digite o valor da Tabuada: ");
		valor = teclado.nextInt();
		System.out.println("");
		while (i < 11) {
		System.out.println(valor + " x " + i + "= " + (valor * i));
		i++;

	}
	}
}
