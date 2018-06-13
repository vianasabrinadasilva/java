package br.com.java;

import java.util.Scanner;

public class CalculadoraServicos {

	public static void main(String[] args) {
	double remuneracao, custo, cargaHoraria;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Calculadora de Serviços");
	System.out.print("Digite o valor da Remuneração mensal: ");
	remuneracao = teclado.nextDouble();
	System.out.print("Digite o valor da Carga horária: ");
	cargaHoraria = teclado.nextDouble();
	custo = remuneracao * 0.3;

	}

}
