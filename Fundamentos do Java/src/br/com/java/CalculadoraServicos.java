package br.com.java;

import java.util.Scanner;

public class CalculadoraServicos {

	public static void main(String[] args) {
	double remuneracao, custo, cargaHoraria, servico, estimativa, total;
	Scanner teclado = new Scanner(System.in);
	System.out.println("¨¨¨¨¨¨¨Calculadora de Serviços¨¨¨¨¨¨¨");
	System.out.println("");
	System.out.print("Digite o valor da Remuneração mensal: ");
	remuneracao = teclado.nextDouble();
	System.out.print("Digite o custo operacional: ");
	custo = teclado.nextDouble();
	System.out.print("Carga horária mensal de trabalho: ");
	cargaHoraria = teclado.nextDouble();
	servico = (remuneracao + (remuneracao * 0.3 ) + custo + (remuneracao * 0.2)) / cargaHoraria;
	System.out.println("Valor da hora de serviço: " + servico);
	System.out.println("");
	System.out.print("Estimativa de horas de serviço: ");
	estimativa = teclado.nextDouble();
	total = estimativa * servico;
	System.out.println("Valor a ser cobrado deste cliente: " + total);
	}

}
