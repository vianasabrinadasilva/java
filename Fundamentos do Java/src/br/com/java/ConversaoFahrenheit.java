package br.com.java;

import java.util.Scanner;

public class ConversaoFahrenheit {

	public static void main(String[] args) {
		double fah, parte,conversao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Conversao Fahrenheit para Celsius");
		System.out.println("");
		//Entrada
		System.out.println("Digite o valor de Fahrenheit: ");
		fah = teclado.nextDouble();
		//Processamento
		parte = (fah - 32);
		conversao = (parte / 1.8);
		//saída
		System.out.println(conversao + "Celsius");
		
		
		
		

	}

}
