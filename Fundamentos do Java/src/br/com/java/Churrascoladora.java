/**
 * Atividade de avaliação - Churrascoladora
 * @author Gabriel David e Sabrina da Silva
 */

package br.com.java;

import java.util.Scanner;

public class Churrascoladora {

	public static void main(String[] args) {
		double homens, mulheres, criancas, carne, cerveja, refri, total, valorPessoa, totalCarne, totalCerveja,
				totalRefri;
		Scanner teclado = new Scanner(System.in);
		// Entrada
		System.out.println("====== CHURRASCOLADORA ======");
		System.out.println("");
		System.out.print("Quantidade de homens: ");
		homens = teclado.nextDouble();
		System.out.print("Quantidade de mulheres: ");
		mulheres = teclado.nextDouble();
		System.out.print("Quantidade de crianças: ");
		criancas = teclado.nextDouble();
		System.out.print("Preço médio do Kg de carne: ");
		carne = teclado.nextDouble();
		System.out.print("Preço médio da lata de cerveja: ");
		cerveja = teclado.nextDouble();
		System.out.print("Preço médio da lata de refri: ");
		refri = teclado.nextDouble();
		// Processamento
		totalCerveja = (homens * 12) + (mulheres * 4);
		totalRefri = (criancas * 2) + (mulheres * 2);
		totalCarne = ((homens + mulheres) * 0.3 + (criancas * 0.1));
		total = (totalCerveja * cerveja + totalCarne * carne + totalRefri * refri);
		valorPessoa = (total / (homens + mulheres));

		// Saída
		System.out.println("");
		System.out.println("________________________________");
		System.out.println("");
		System.out.println("Lista de compras");
		// Exibir quantidade e preço
		System.out.println("Quantidade total de carne: " + totalCarne + "kg " + " | " + "R$: " + totalCarne * carne);
		System.out.println(
				"Quantidade total de cerveja: " + totalCerveja + " latas" + " | " + "R$: " + totalCerveja * cerveja);
		System.out.println("Quantidade total de refri: " + totalRefri + " latas" + " | " + "R$: " + totalRefri * refri);
		System.out.println("");
		System.out.println("__________________________________");
		System.out.println("");
		System.out.println("Valor total do churras: " + "R$: " + total);
		System.out.println("Valor por pessoa: " + "R$: " + valorPessoa);

	}

}
