package br.com.java;

import java.util.Scanner;

public class CalculadoraFlex {

	public static void main(String[] args) {
		double gasolina, alcool, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora FLEX");
		System.out.print("Digite o valor do álcool: ");
		alcool = teclado.nextDouble();
		System.out.print("Digite o valor da gasolina: ");
		gasolina = teclado.nextDouble();
		gasolina = (alcool / gasolina);
		System.out.println("Resultado: " + gasolina);
		if (gasolina < 0.7) {
			System.out.println("Vantajoso abastecer com Álcool");
		} else {
			System.out.println("Vantajoso abastecer com Gasolina");
		}

	}

}
