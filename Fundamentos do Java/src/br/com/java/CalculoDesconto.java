package br.com.java;

import java.util.Scanner;

public class CalculoDesconto {

	public static void main(String[] args) {
		double preço,desconto,total;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Desconto do Produto");
		System.out.println("desconto % de preço = total");
		//entrada
		System.out.print("Digite o preço = ");
		preço = teclado.nextDouble();
		System.out.println("Digite o Desconto% = ");
		desconto = teclado.nextDouble();
		//processamento
		total = (preço * desconto) / 100;
		//saida
		System.out.println(preço + "% de " + desconto + " = " + total);

	}

}
