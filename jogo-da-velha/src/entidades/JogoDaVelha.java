package entidades;

import java.util.Scanner;

public class JogoDaVelha {

	private static String[][] tabuleiro = new String[3][3];

	// instancia os jogadores
	private static Jogador jogadorDaPecaX = new Jogador();
	private static Jogador jogadorDaPecaO = new Jogador();

	// instancia peca
	private Peca pecaX = new Peca("X");
	private Peca pecaO = new Peca("O");

	private static boolean oJogoTemUmGanhador = false;
	private static Jogador jogadorVencedor;

	private static void vericarQualJogadorGanhou() {

		
		// verifica quem marcou ponto na mesma linha
//		for (int l = 0; l < tabuleiro.length; l++) {
//
//			// zera ocontador para as duas peças para cada linha
//			numeroDevezesQuePecaOapareceuNaLinha = 0;
//			numeroDevezesQuePecaXapareceuNaLinha = 0;
//
//			for (int c = 0; c < tabuleiro[l].length; c++) {
//
//				// conta quantas vezes a peca apaceu na linha
//				if (tabuleiro[l][c] == pecaX.getTipoDaPeca()) {
//
//					numeroDevezesQuePecaXapareceuNaLinha++;
//				} else if (tabuleiro[l][c] == pecaO.getTipoDaPeca()) {
//					numeroDevezesQuePecaOapareceuNaLinha++;
//				}
//
//				// define o jogador vencedor
//				if (numeroDevezesQuePecaOapareceuNaLinha == 3) {
//					jogadorVencedor = jogadorDaPecaO;
//					oJogoTemUmGanhador = true;
//				} else if (numeroDevezesQuePecaXapareceuNaLinha == 3) {
//					jogadorVencedor = jogadorDaPecaX;
//					oJogoTemUmGanhador = true;
//				}
//			}
//		}

		// verifica se marcou ponto na linha para peça X
		if (tabuleiro[0][0] == "X" && tabuleiro[0][1] == "X" && tabuleiro[0][2] == "X") {
			jogadorVencedor = jogadorDaPecaX;
			oJogoTemUmGanhador = true;
			System.out.println("Jogador de X ganhou!");
		} else if (tabuleiro[1][0] == "X" && tabuleiro[1][1] == "X" && tabuleiro[1][2] == "X") {
			jogadorVencedor = jogadorDaPecaX;
			oJogoTemUmGanhador = true;
			System.out.println("Jogador de X ganhou!");
		} else if (tabuleiro[2][0] == "X" && tabuleiro[2][1] == "X" && tabuleiro[2][2] == "X") {
			jogadorVencedor = jogadorDaPecaX;
			oJogoTemUmGanhador = true;
			System.out.println("Jogador de X ganhou!");
		}
		// verifica se marcou ponto na linha para peça O
		if (tabuleiro[0][0] == "O" && tabuleiro[0][1] == "O" && tabuleiro[0][2] == "O") {
			jogadorVencedor = jogadorDaPecaO;
			oJogoTemUmGanhador = true;
			System.out.println("Jogador de O ganhou!");
		} else if (tabuleiro[1][0] == "O" && tabuleiro[1][1] == "O" && tabuleiro[1][2] == "O") {
			jogadorVencedor = jogadorDaPecaO;
			oJogoTemUmGanhador = true;
			System.out.println("Jogador de O ganhou!");
		} else if (tabuleiro[2][0] == "O" && tabuleiro[2][1] == "O" && tabuleiro[2][2] == "O") {
			jogadorVencedor = jogadorDaPecaO;
			oJogoTemUmGanhador = true;
			System.out.println("Jogador de O ganhou!");
		}

		// conta as marcações de peças para a coluna
		// na coluna 1, 2 e 3 para peça X
//		if (tabuleiro[0][0] == "X" || tabuleiro[1][0] == "X" || tabuleiro[2][0] == "X") {
//
//			numeroDeVezesQuePecaXApareceuNaColuna++;
//		} else if (tabuleiro[0][1] == "X" || tabuleiro[1][1] == "X" || tabuleiro[2][1] == "X") {
//			numeroDeVezesQuePecaXApareceuNaColuna++;
//		} else if (tabuleiro[0][2] == "X" || tabuleiro[1][2] == "X" || tabuleiro[2][2] == "X") {
//			numeroDeVezesQuePecaXApareceuNaColuna++;
//		}
//		// aqui na coluna 1, 2 e 3 para a peça O
//		if (tabuleiro[0][0] == "O" || tabuleiro[1][0] == "O" || tabuleiro[2][0] == "O") {
//			numeroDeVezesQuePecaOApareceuNaColuna++;
//		} else if (tabuleiro[0][1] == "O" || tabuleiro[1][1] == "O" || tabuleiro[2][1] == "O") {
//			numeroDeVezesQuePecaOApareceuNaColuna++;
//		} else if (tabuleiro[0][2] == "O" || tabuleiro[1][2] == "O" || tabuleiro[2][2] == "O") {
//			numeroDeVezesQuePecaOApareceuNaColuna++;
//		}

		// Verifica quem marcou ponto na coluna para X
		if (tabuleiro[0][0] == "X" && tabuleiro[1][0] == "X" && tabuleiro[2][0] == "X") {
			jogadorVencedor = jogadorDaPecaX;
			oJogoTemUmGanhador = true;
			System.out.println("Jogador de X ganhou!");
		} else if (tabuleiro[0][1] == "X" && tabuleiro[1][1] == "X" && tabuleiro[2][1] == "X") {
			jogadorVencedor = jogadorDaPecaX;
			oJogoTemUmGanhador = true;
			System.out.println("Jogador de X ganhou!");
		} else if (tabuleiro[0][2] == "X" && tabuleiro[1][2] == "X" && tabuleiro[2][2] == "X") {
			jogadorVencedor = jogadorDaPecaX;
			oJogoTemUmGanhador = true;
			System.out.println("Jogador de X ganhou!");
		}
		// Verifica quem marcou ponto na coluna para O
		if (tabuleiro[0][0] == "O" && tabuleiro[1][0] == "O" && tabuleiro[2][0] == "O") {
			jogadorVencedor = jogadorDaPecaO;
			oJogoTemUmGanhador = true;
			System.out.println("Jogador de O ganhou!");
		} else if (tabuleiro[0][1] == "O" && tabuleiro[1][1] == "O" && tabuleiro[2][1] == "O") {
			jogadorVencedor = jogadorDaPecaO;
			oJogoTemUmGanhador = true;
			System.out.println("Jogador de O ganhou!");
		} else if (tabuleiro[0][2] == "O" && tabuleiro[1][2] == "O" && tabuleiro[2][2] == "O") {
			jogadorVencedor = jogadorDaPecaO;
			oJogoTemUmGanhador = true;
			System.out.println("Jogador de O ganhou!");
		}

		// Verifica quem marcou ponto na diagonal,
		// aqui para peça X
		if (tabuleiro[0][0] == "X" && tabuleiro[1][1] == "X" && tabuleiro[2][2] == "X") {
			jogadorVencedor = jogadorDaPecaX;
			oJogoTemUmGanhador = true;
			System.out.println("Jogador de X ganhou!");
		} else if (tabuleiro[0][2] == "X" && tabuleiro[1][1] == "X" && tabuleiro[2][0] == "X") {
			jogadorVencedor = jogadorDaPecaX;
			oJogoTemUmGanhador = true;
			System.out.println("Jogador de X ganhou!");
		}
		// verifica marcação de ponto na diagonal para peça O
		if (tabuleiro[0][0] == "O" && tabuleiro[1][1] == "O" && tabuleiro[2][2] == "O") {
			jogadorVencedor = jogadorDaPecaO;
			oJogoTemUmGanhador = true;
			System.out.println("Jogador de O ganhou!");
		} else if (tabuleiro[0][2] == "O" && tabuleiro[1][1] == "O" && tabuleiro[2][0] == "O") {
			jogadorVencedor = jogadorDaPecaO;
			oJogoTemUmGanhador = true;
			System.out.println("Jogador de O ganhou!");
		}

	}	
	
	// metodo para exibir o tabuleiro
		public void exibirTabuleiro() {
			// exibe o tabuleiro do jogo
			for (int l = 0; l < tabuleiro.length; l++) {
				System.out.println();
				for (int c = 0; c < tabuleiro[l].length; c++) {
					if (tabuleiro[l][c] == null) {
						System.out.print("_ ");
					} else {
						System.out.print(tabuleiro[l][c] + " ");
					}

				}
			}
			System.out.println();
			System.out.println();
		}	

	// Metodo para pedir que os jogadores façam suas jogadas
	public void rodarJogo() {

		int linha;
		int coluna;
		Scanner sc = new Scanner(System.in);

		System.out.println();
		while (oJogoTemUmGanhador == false) {

			// exibe o tabuleiro do jogo
			exibirTabuleiro();

			// pede para jogador da peça X jogar
			System.out.println("Jogador de X escolha onde quer jogar, linha e coluna.");
			System.out.print("Linha: ");
			linha = sc.nextInt();
			System.out.print("Coluna: ");
			coluna = sc.nextInt();
			// coloca a peça X no lugar
			if (tabuleiro[linha][coluna] == null) {
				tabuleiro[linha][coluna] = "X";
			}
			// após a jogada verifica se o jogador de X ganhou
			vericarQualJogadorGanhou();
			if (oJogoTemUmGanhador) {
				exibirTabuleiro();
				break;
			}

			// exibe o tabuleiro após o jogada de X
			exibirTabuleiro();

			// pede para jogador da peça O jogar
			System.out.println("Jogador de O escolha onde quer jogar, linha e coluna.");
			System.out.print("Linha: ");
			linha = sc.nextInt();
			System.out.print("Coluna: ");
			coluna = sc.nextInt();
			// coloca a peça O no lugar
			if (tabuleiro[linha][coluna] == null) {
				tabuleiro[linha][coluna] = "O";
			}
			// após a jogada verifica se o jogador de O ganhou
			vericarQualJogadorGanhou();
			if (oJogoTemUmGanhador) {
				exibirTabuleiro();
				break;
			}

		}

		sc.close();

	}
	
}
