package entidades;

import java.util.Scanner;

public class Jogador {

	public void fazerJogada() {
		
		
		Scanner entradaDeDados = new Scanner(System.in);
		
		// pede o para o jogador mover a peça
		System.out.println("Escolha o local onde quer jogar, linha e coluna.");
		System.out.print("Linha: ");
		String linha = entradaDeDados.next();
		System.out.print("Coluna: ");
		String coluna = entradaDeDados.next();
		
		System.out.println("A linha recebida foi " + linha + " e a coluna recebida foi " + coluna);
		
		
		// fecha a entrada de dados
		entradaDeDados.close();
		
	}
}
