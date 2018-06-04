package br.com.java;

import java.util.Scanner;

public class CalculoLucro {

	public static void main(String[] args) {
		double custo,venda,lucro;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora do Lucro");
		System.out.println("");
		//entrada
		System.out.print("Preço do custo: ");
		custo = teclado.nextDouble();
		System.out.print("% do lucro: ");
		lucro = teclado.nextDouble();
		//processamento..
		venda = custo + ((custo * lucro) / 100);
		// saida
		System.out.println("Preço de venda: " + venda);


	}

}
