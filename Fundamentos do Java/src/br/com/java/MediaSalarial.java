package br.com.java;

import java.util.Scanner;

public class MediaSalarial {

	public static void main(String[] args) {
		// entrada
		double pai, mae, filho, filha, media;
		System.out.print("Digite a renda do Pai: ");
		Scanner teclado = new Scanner(System.in);
		pai = teclado.nextDouble();
		System.out.print("Digite a renda da M�e: ");
		mae = teclado.nextDouble();
		System.out.print("Digite a sua renda: ");
		filho = teclado.nextDouble();
		System.out.print("Digite a renda da Irm�: ");
		filha = teclado.nextDouble();
		// processamento
		media = (pai + mae + filho + filha) / 4;
		// sa�da
		System.out.println("M�dia: " + media);
		if (media < 933) {
			System.out.println("Voc� � apto a ganhar uma bolsa");
		} else {
			System.out.println("Voc� n�o � apto a ganhar uma bolsa");
		}

	}

}