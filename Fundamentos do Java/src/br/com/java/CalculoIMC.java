package br.com.java;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
	double altura,peso,imc;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Calculo do IMC");
	System.out.print("Digite o seu peso: ");
	peso = teclado.nextDouble();
	System.out.print("Digite a sua altura: ");
	altura = teclado.nextDouble();
	imc = peso / (altura * altura);
	System.out.println("O seu IMC é: " + imc);
	if (imc < 16) {
		System.out.println("Muito abaixo do peso");
	} else if (imc == 17 || imc == 18.49) {
		System.out.println("Abaixo do peso");
	} else if (imc == 18.5 || imc == 24.99) {
		
		
	} else {

	}
	

	}

}
