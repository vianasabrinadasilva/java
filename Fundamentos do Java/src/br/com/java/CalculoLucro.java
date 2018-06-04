package br.com.java;

import java.util.Scanner;

public class CalculoLucro {

	public static void main(String[] args) {
		double compra,venda,lucro,porcentagem;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Lucro Adquirido");
		//entrada
		System.out.print("Digite valor da compra = ");
		compra = teclado.nextDouble();
		System.out.print("Digite o valor a ser vendido = ");
		venda = teclado.nextDouble();
		//processamento
		lucro = (venda - compra);
		porcentagem = (lucro * 100) / compra;
		System.out.println(porcentagem + "% de lucro " );


	}

}
