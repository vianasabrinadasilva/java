package br.com.java;

import java.util.Scanner;

public class CalculadoraServicos {

	public static void main(String[] args) {
	double remuneracao, custo, cargaHoraria;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Calculadora de Servi�os");
	System.out.print("Digite o valor da Remunera��o mensal: ");
	remuneracao = teclado.nextDouble();
	System.out.print("Digite o valor da Carga hor�ria: ");
	cargaHoraria = teclado.nextDouble();
	custo = remuneracao * 0.3;

	}

}
