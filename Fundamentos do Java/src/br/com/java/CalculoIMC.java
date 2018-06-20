package br.com.java;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		double peso, altura, imc;
		System.out.println("Digite o seu peso em kg: ");
		//entrada 
		Scanner teclado = new Scanner(System.in);
		peso = teclado.nextDouble();
		System.out.println("Digite sua altura em metros: ");
		altura = teclado.nextDouble();
		// calculo
		imc = peso / (altura * altura);
		//saída
        System.out.println(" o valor da sua massa corporal é: " + imc);
        System.out.println("");
        if (imc < 18.49) {
			System.out.println("ABAIXO DO PESO");
		} else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("PESO IDEAL");
		} else if (imc >= 25 && imc <= 29.99) {
            System.out.println("ACIMA DO PESO");
	    } else if (imc >= 30  && imc <= 34.99) {
	        System.out.println("OBESIDADE 1");
	    } else if (imc >= 35  && imc <= 39.99) {
            System.out.println("OBESIDADE 2");
        } else {
            System.out.println("OBESIDADE 3");
       }
	}


	}
