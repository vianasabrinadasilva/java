package br.com.java;

import java.util.Scanner;

public class CalculoDesconto {

	public static void main(String[] args) {
		double totalDesconto,desconto,total,valorPago,troco;
		Scanner teclado = new Scanner(System.in);
		System.out.println("PDV");
		System.out.println("");
		//entrada
		System.out.print("Total: ");
		total = teclado.nextDouble();
		System.out.print("% de Desconto: ");
		desconto = teclado.nextDouble();
		totalDesconto = total - ((total * desconto) / 100);
		//saida
		System.out.println("Total com Desconto: " + totalDesconto);
		System.out.print("Valor Pago: ");
		valorPago = teclado.nextDouble();
		troco = valorPago - totalDesconto;
		System.out.println("Troco: " + troco);
		
			

	}

}
