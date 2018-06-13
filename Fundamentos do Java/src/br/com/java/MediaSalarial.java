package br.com.java;

import java.util.Scanner;

public class MediaSalarial {

	public static void main(String[] args) {
		// entrada
		double pai, mae, filho, filha, media;
		System.out.print("Digite a renda do Pai: ");
		Scanner teclado = new Scanner(System.in);
		pai = teclado.nextDouble();
		System.out.print("Digite a renda da Mãe: ");
		mae = teclado.nextDouble();
		System.out.print("Digite a sua renda: ");
		filho = teclado.nextDouble();
		System.out.print("Digite a renda da Irmã: ");
		filha = teclado.nextDouble();
		// processamento
		media = (pai + mae + filho + filha) / 4;
		// saída
		System.out.println("Média: " + media);
		if (media < 933) {
			System.out.println("Você é apto a ganhar uma bolsa");
		} else {
			System.out.println("Você não é apto a ganhar uma bolsa");
		}

	}

}