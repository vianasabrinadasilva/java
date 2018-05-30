package br.com.java;

import java.util.Scanner;

public class Regra3 {


	public static void main(String[] args) {
		double x,y,valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Regra de 3");
		System.out.println("X % de Y = valor");
		System.out.println("");
		//entrada
		System.out.print("Digite o valor de X: ");
		x = teclado.nextDouble();
		System.out.print("Digite o valor de Y: ");
		y = teclado.nextDouble();
		//processamento
		valor = (x * y) / 100;
		//saida
		//concatenando(unindo) variáveis com textos
		System.out.println(x + " % de " + y + " = " + valor );
		
				
	}

}
