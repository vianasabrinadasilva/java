package br.com.java;

import java.util.Scanner;

public class CalculoAreaCirculo {

	public static void main(String[] args) {
		double raio, area, PI;
		PI = 3.14;
		System.out.print("Digite o valor do raio: ");
		Scanner teclado = new Scanner(System.in);
		raio = teclado.nextDouble();
		area = PI * raio * raio;
		System.out.println("O valor da area é: " + area);
		
	}

}
