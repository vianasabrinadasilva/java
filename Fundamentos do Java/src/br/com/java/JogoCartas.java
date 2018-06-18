package br.com.java;

import java.util.Random;

public class JogoCartas {

	public static void main(String[] args) {
		Random carta = new Random();
		String[] nipes= {"♥","♦","♣","♠"};
		String[] faces= {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		//System.out.println(faces[11] + nipes[0]);
		int face = carta.nextInt(faces.length);
		int nipe = carta.nextInt(4);
		System.out.println(faces[face] + nipes[nipe]);
		
		

	}

}
